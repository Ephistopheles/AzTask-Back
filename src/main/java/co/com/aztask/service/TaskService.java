package co.com.aztask.service;

import java.util.List;

import co.com.aztask.model.Person;
import co.com.aztask.model.Task;

public interface TaskService {
	
	Task saveTask(Task task);
	
	List<Person> getAllTasks();
	
	Task getTaskById(Long id);

}
