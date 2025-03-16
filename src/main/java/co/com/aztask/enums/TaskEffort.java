package co.com.aztask.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskEffort {

	BJ("Bajo"),
	MD("Medio"),
	AT("Alto");

	private final String description;

	public String getCode() {
		return this.name();
	}

}
