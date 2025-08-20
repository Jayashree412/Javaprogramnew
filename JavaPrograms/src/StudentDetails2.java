import java.util.Scanner;
public class StudentDetails2 
{
	int empId;
	String empName;
	String empAdd;
	static String empComp="Danube";
	public static void main(String[] args) 
	{
		StudentDetails2 s1=new StudentDetails2();
		s1.getdetails();
		s1.getempadd();

	}
	public void getdetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the employee ID:");
		empId=scanner.nextInt();
		System.out.println("Enter the employee Name:");
		empName=scanner.next();
		
	}
	public void getempadd()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the employee area:");
		empAdd=scanner.next();
		if(empAdd.equals("Chennai"))
		{
			System.out.println("The employee is from Tamil Nadu");
		}
		else if(empAdd.equals("Kochi"))
		{
			System.out.println("The employee is from Kerala");
		}
		else
		{
			System.out.println("The employee is not from South side");
		}
	}
}
