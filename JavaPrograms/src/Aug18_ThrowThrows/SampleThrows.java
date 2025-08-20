package Aug18_ThrowThrows;

public class SampleThrows 
{
	static int division;

	public static void main(String[] args) 
	{
		try//since we can get division by 0 exception error we used try catch block to handle the exception
		{
			divide(75,0);
			System.out.println(division);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception here");
		}	
	}
	public static void divide(int m, int n) throws ArithmeticException//Throws used to denote that when possibility of error can occur
	{
		 division=m/n;
		
	}

}
