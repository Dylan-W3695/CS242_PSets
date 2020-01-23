package problemSets;
import java.lang.String;

public class ExpectedEventException extends Exception{

	public ExpectedEventException() {}
	
	public ExpectedEventException(String error) {
		super(error);
	}
}
