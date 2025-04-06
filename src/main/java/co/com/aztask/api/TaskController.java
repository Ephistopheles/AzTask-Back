package co.com.aztask.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping(path = "/createTask", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<TaskDTO>> createTask(@RequestBody TaskDTO taskDTO) {
		return ResponseEntity.ok(ResponseData.success(taskService.createTask(taskDTO), "Tarea creada correctamente"));
	}

	@GetMapping(path = "/getTaskById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<TaskDTO>> getTask(@PathVariable @NotNull Long id) {
		return ResponseEntity.ok(ResponseData.success(taskService.getTaskById(id)));
	}

	@PutMapping(path = "/updateTask", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<TaskDTO>> updateTask(@RequestBody TaskDTO taskDTO) {
		return ResponseEntity.ok(ResponseData.success(taskService.updateTask(taskDTO), "Tarea actualizada correctamente"));
	}

	@DeleteMapping(path = "/deleteTask/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<Void>> deleteTask(@PathVariable Long id) {
		taskService.deleteTaskById(id);
		return ResponseEntity.ok(ResponseData.success("Tarea eliminada correctamente"));
	}

	@GetMapping(path = "/getTasksByPersonId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<List<TaskDTO>>> getTasks(@PathVariable Long id) {
		return ResponseEntity.ok(ResponseData.success(taskService.getTasksByPersonId(id)));
	}

}
