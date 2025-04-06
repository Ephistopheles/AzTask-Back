package co.com.aztask.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.aztask.convert.TaskConvert;
import co.com.aztask.dao.TaskDAO;
import co.com.aztask.dto.TaskDTO;
import co.com.aztask.entity.TaskEntity;
import co.com.aztask.enums.TaskEffort;
import co.com.aztask.enums.TaskStatus;
import co.com.aztask.exception.TaskException;
import co.com.aztask.service.TaskService;
import co.com.aztask.util.EnumUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

	private final TaskDAO taskDAO;

	@Override
	@Transactional
	public TaskDTO createTask(TaskDTO taskDTO) {
		return TaskConvert.toDTO(taskDAO.save(TaskConvert.toEntity(taskDTO)));
	}

	@Override
	@Transactional(readOnly = true)
	public TaskDTO getTaskById(Long id) {
		return taskDAO.findById(id)
				.map(TaskConvert::toDTO)
				.orElseThrow(() -> new TaskException("Tarea con el ID " + id + " no encontrada"));
	}

	@Override
	@Transactional
	public TaskDTO updateTask(TaskDTO taskDTO) {
		TaskEntity existingTask = taskDAO.findById(taskDTO.getId())
				.orElseThrow(() -> new TaskException("Tarea con el ID " + taskDTO.getId() + " no encontrada"));

		existingTask.setTitle(taskDTO.getTitle());
		existingTask.setDescription(taskDTO.getDescription());
		existingTask.setStatus(EnumUtils.fromString(TaskStatus.class, taskDTO.getStatus()));
		existingTask.setEffort(EnumUtils.fromString(TaskEffort.class, taskDTO.getEffort()));
		existingTask.setUpdatedAt(LocalDateTime.now());

		return TaskConvert.toDTO(taskDAO.save(existingTask));
	}

	@Override
	@Transactional
	public void deleteTaskById(Long id) {
		taskDAO.delete(taskDAO.findById(id)
				.orElseThrow(() -> new TaskException("Tarea con el ID " + id + " no encontrada")));
	}

	@Override
	@Transactional(readOnly = true)
	public List<TaskDTO> getTasksByPersonId(Long personId) {
		return Optional.of(taskDAO.findByPersonId(personId))
				.filter(e -> !e.isEmpty())
				.map(e -> e.stream()
						.map(TaskConvert::toDTO)
						.toList())
				.orElseThrow(() -> new TaskException("No hay tareas asociadas a la persona con ID: " + personId));
	}

}
