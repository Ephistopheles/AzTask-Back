package co.com.aztask.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDTO {

	private Long id;

	private String title;

	private String description;

	private String status;

	private Long personId;
}
