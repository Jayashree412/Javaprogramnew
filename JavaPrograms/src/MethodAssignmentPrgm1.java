import java.util.Scanner;
public class MethodAssignmentPrgm1 
{
	static String name;
	static int age;
	public static void main(String[] args) 
	{
		MethodAssignmentPrgm1.display();
	}
	public static void getDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=scanner.next();
		System.out.println("Enter the age:");
	    age=scanner.nextInt();
	}
	public static void display()
	{
		MethodAssignmentPrgm1.getDetails();
		System.out.println("The name is:"+name);
		System.out.println("The age of"+ " "+ name + " "+"is:"+age);
		
	}

}
