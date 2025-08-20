package Inheritance;

public class SampleManager extends SampleEmployee 
{
int bonus=1000;
String project="Axis";
	public static void main(String[] args) 
	{
		SampleManager manager=new SampleManager();
		manager.display();
		manager.empid=55;
		System.out.println("Employee ID:"+manager.empid);
		manager.name="Shiva";
		System.out.println("Employee name:"+manager.name);
		manager.dept="Sales";
		System.out.println("Employee dept is:"+manager.dept);
		System.out.println("The bonus of employee is:"+manager.bonus);
		System.out.println("The Employee belongs to:"+manager.project);
		
	}

}
