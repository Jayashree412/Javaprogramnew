package Aug18_ThrowThrows;

public class SampleThrow 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			voting(17);
		} 
		catch (InvalidAgeException e) 
		{
			System.out.println("Invalid age for voting");
		}	
	}
	public static void voting(int age) throws InvalidAgeException
	{
		if(age>18)
		{
			System.out.println("Eligible for Voting");
		}
		else 
		{
		throw new InvalidAgeException("Not Eligible");//Exception using throw statement. We show that exception happen here
		//throw new ArithmeticException("Not Eligible"); //here the exception is invalid hence above custom made(line 24) is created
		
		}
	}
}
//Custom exception is possible-here for voting we do not require arithmetic exception 
//we used InvalidAgeException class which inherited from Exception class to use a custom made exception message
//Only one throw is possible 
//Multiple Throws are possible
//Use of custom made-to create meaningful exception messages for a exception