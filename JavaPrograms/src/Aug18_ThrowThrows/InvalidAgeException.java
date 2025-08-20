package Aug18_ThrowThrows;

public class InvalidAgeException extends Exception//to make custom made exception we inherit from Exception class in SampleThrow
{
	String message;
	public InvalidAgeException(String message) 
	{
		super(message);
	}
	
}
