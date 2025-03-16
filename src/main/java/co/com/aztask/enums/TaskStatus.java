package co.com.aztask.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

	INC("Incompleta"),
	COM("Medio");

	private final String description;

	public String getCode() {
		return this.name();
	}

}
