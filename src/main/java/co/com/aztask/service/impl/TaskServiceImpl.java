package co.com.aztask.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.com.aztask.dao.TaskDAO;
import co.com.aztask.model.Person;
import co.com.aztask.model.Task;
import co.com.aztask.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	private final TaskDAO taskDAO;

	public TaskServiceImpl(TaskDAO taskDAO) {
		this.taskDAO = taskDAO;
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTaskById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
