package co.com.aztask.exception;

public class PersonException extends RuntimeException {

	private static final long serialVersionUID = 6619913962426287432L;

	public PersonException(String msg) {
		super(msg);
	}

	public PersonException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
