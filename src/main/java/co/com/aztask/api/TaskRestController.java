package co.com.aztask.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.aztask.service.TaskService;


@RestController
@Validated
public class TaskRestController {

	private final TaskService taskService;

	public TaskRestController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping(path = "/helloTask", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> holaMundo() {
		String message = "Hola mundo";
		return ResponseEntity.ok(message);
	}

}
