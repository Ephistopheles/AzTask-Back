package co.com.aztask.mapper;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import co.com.aztask.enums.BaseEnum;

@Component
public class EnumMapper {

	public <E extends Enum<E> & BaseEnum> E fromCode(Class<E> enumClass, String code) {
		return Arrays.stream(enumClass.getEnumConstants())
				.filter(e -> e.getCode().equals(code))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Código no válido: " + code));
	}

	public <E extends BaseEnum> String toDescription(E enumValue) {
		return enumValue != null ? enumValue.getDescription() : null;
	}

}

