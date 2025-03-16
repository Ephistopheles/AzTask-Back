package co.com.aztask.service;

import java.util.List;

import co.com.aztask.dto.TaskDTO;

public interface TaskService {
	
	TaskDTO createTask(TaskDTO taskDTO);
	
	TaskDTO getTaskById(Long id);
	
	TaskDTO updateTask(TaskDTO taskDTO);
	
	void deleteTaskById(Long id);
	
	List<TaskDTO> getTasksByPersonId(Long personId);
}
