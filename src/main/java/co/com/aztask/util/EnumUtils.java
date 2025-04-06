package co.com.aztask.util;

public class EnumUtils {

	public static <E extends Enum<E>> E fromString(Class<E> enumClass, String value) {
		if (value == null) return null;

		try {
			return Enum.valueOf(enumClass, value);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

}
