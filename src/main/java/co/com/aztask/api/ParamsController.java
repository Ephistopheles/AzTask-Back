package co.com.aztask.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.aztask.dto.ParamTaskEffortDTO;
import co.com.aztask.enums.TaskEffort;
import co.com.aztask.response.ResponseData;

@Validated
@RestController
public class ParamsController {

	@GetMapping(path = "/getTaskEffort", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseData<List<ParamTaskEffortDTO>>> getTaskEffort() {
		return ResponseEntity.ok(ResponseData.success(
				Arrays
				.stream(TaskEffort.values())
				.map(e -> new ParamTaskEffortDTO(e.getCode(), e.getDescription()))
				.toList()));
	}

}
