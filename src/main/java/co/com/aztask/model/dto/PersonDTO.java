package co.com.aztask.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {

	private Long id;

	private String names;

	private String surnames;

	private String address;

	private String phone;
}