package co.com.aztask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import co.com.aztask.response.ResponseData;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TaskException.class)
	public ResponseEntity<ResponseData<Void>> handleNotFound(TaskException ex) {
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(ResponseData.failure(ex.getMessage()));
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ResponseData<String>> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body(ResponseData.failure(String.format("Valor no válido '%s' para el parámetro '%s'. Valor numérico esperado", ex.getValue(), ex.getName())));
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseData<Void>> handleGeneralException(Exception ex) {
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ResponseData.failure("Ha ocurrido un error inesperado, intente nuevamente"));
	}

}
