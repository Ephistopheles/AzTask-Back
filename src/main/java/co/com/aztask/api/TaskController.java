package co.com.aztask.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.aztask.dto.TaskDTO;
import co.com.aztask.response.ResponseData;
import co.com.aztask.service.TaskService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequiredArgsConstructor
public class TaskController {

	private final TaskService taskService;

	@GetMapping(path = "/getTaskById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<TaskDTO>> getTask(@PathVariable @NotNull Long id) {
		return ResponseEntity.ok(ResponseData.success(taskService.getTaskById(id)));
	}

	@PostMapping(path = "/createTask", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<TaskDTO>> createTask(@RequestBody TaskDTO taskDTO) {
		TaskDTO task = taskService.saveTask(taskDTO);
		return ResponseEntity.ok(ResponseData.success(task, "Task created successfully"));
	}

}
