package problemSets;

public class UnexpectedEventException extends RuntimeException{

	public UnexpectedEventException() {}
	
	public UnexpectedEventException(String error) {
		super(error);
	}
}
