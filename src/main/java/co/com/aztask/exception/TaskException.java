package co.com.aztask.exception;

public class TaskException extends RuntimeException {

	private static final long serialVersionUID = -384088812437773153L;

	public TaskException(String msg) {
		super(msg);
	}

	public TaskException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
