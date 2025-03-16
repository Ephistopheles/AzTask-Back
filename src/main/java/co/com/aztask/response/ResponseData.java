package co.com.aztask.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData<T> {

	private String message;

	private T data;

	public static <T> ResponseData<T> success(T data, String message) {
		return new ResponseData<>(message, data);
	}

	public static <T> ResponseData<T> success(T data) {
		return new ResponseData<>(null, data);
	}

	public static <T> ResponseData<T> success(String message) {
		return new ResponseData<>(message, null);
	}

	public static <T> ResponseData<T> failure(T data, String message) {
		return new ResponseData<>(message, data);
	}

	public static <T> ResponseData<T> failure(T data) {
		return new ResponseData<>(null, data);
	}

	public static <T> ResponseData<T> failure(String message) {
		return new ResponseData<>(message, null);
	}

}
