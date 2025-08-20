import java.util.Scanner;
public class MethodsAssignmentPrgm2 
{
	static int number;
	static int factorial;
	public static void main(String[] args) 
	{
		MethodsAssignmentPrgm2.getdetails();
		MethodsAssignmentPrgm2.factorial();
		MethodsAssignmentPrgm2.display();
	}
	public static void getdetails()
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number for which factorial needs to be calculated: ");
	        number = scanner.nextInt();
	}
	public static void factorial()
	{
		factorial = 1;
        int i = number;
        do 
        {
            factorial *= i;
            i--;
        } 
        while (i > 0);
	}
	public static void display()
	{
	 System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
