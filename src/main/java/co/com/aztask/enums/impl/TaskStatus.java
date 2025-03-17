package co.com.aztask.enums.impl;

import co.com.aztask.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus implements BaseEnum {

	INC("Incompleta"),
	COM("Completa");

	private final String description;

	@Override
	public String getCode() {
		return this.name();
	}

}
