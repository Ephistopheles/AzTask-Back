package co.com.aztask.service;

import java.util.List;

import co.com.aztask.dto.TaskDTO;
import co.com.aztask.model.Person;

public interface TaskService {
	
	TaskDTO saveTask(TaskDTO task);
	
	List<Person> getAllTasks();
	
	TaskDTO getTaskById(Long id);

}
