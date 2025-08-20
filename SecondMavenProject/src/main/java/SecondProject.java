
public class SecondProject 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]= {4,5,6,7};
			System.out.println(a[5]);
			int division=85/0;
			System.out.println(division);		
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception");//it comes from line no 8 and 9
		}*/
		catch(Exception e)//superclass exception will execute first
		{
			System.out.println("Exception occured"+e);
		}
		//System.out.println("hello");
		finally
		{
			System.out.println("In Finally block");
		}
	}
	

}

//Maven-Project management tool based on POM(Project Object Model)pom.xml-to automate a build
//Jenkins-automation tool to deploy the build
//Build-to combine a many configurations or files into one file
//Uses of Maven-dependencies and build file(JAR or WAR file). The end process of Maven is we get JAR file which we deploy in production

//Exception handling in java is powerful mechanism to handle the runtime errors
//An exception disrupts the normal flow of the java program
//Advantage-maintain normal flow of the program .
//Types-Checked exception,unchecked exceptions
//Checked exception-That directly inherits Throwable-exception. checked at compile time
//Unchecked exception-We can check only at run time exception. Not checked at compile time but only at runtime
//Try block and catch block-One try and multiple catches are possible
//Try block-problem occurring statement or block
//Catch block-To handle the error
//Finally block-must be executed block-to get the password from a file and close the file is must after automation.
//Eventhough if any error occured we must close the file so to close the file we use finally block
//Throw and Throws-