package co.com.aztask.enums.impl;

import co.com.aztask.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskEffort implements BaseEnum {

	BJ("Bajo"),
	MD("Medio"),
	AT("Alto");

	private final String description;

	@Override
	public String getCode() {
		return this.name();
	}

}
