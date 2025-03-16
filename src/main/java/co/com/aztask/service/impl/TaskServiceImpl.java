package co.com.aztask.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.aztask.dao.TaskDAO;
import co.com.aztask.dto.TaskDTO;
import co.com.aztask.exception.TaskException;
import co.com.aztask.mapper.TaskMapper;
import co.com.aztask.model.Person;
import co.com.aztask.service.TaskService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

	private final TaskDAO taskDAO;
	
	private final TaskMapper taskMapper;
	
	@Override
	@Transactional
	public TaskDTO saveTask(TaskDTO taskDTO) {
        return taskMapper.toDTO(taskDAO.save(taskMapper.toEntity(taskDTO)));
	}

	@Override
	public List<Person> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskDTO getTaskById(Long id) {
		return taskDAO.findById(id)
				.map(taskMapper::toDTO)
				.orElseThrow(() -> new TaskException("Task with id " + id + " not found"));
	}

}
