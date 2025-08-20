package Inheritance;

public class SampleTeacher extends SampleEmployee 
{

	public static void main(String[] args) 
	{
		SampleTeacher.display();
		SampleEmployee.display();
	}
	public static void display()
	{
		System.out.println("This is Hierarchial class");
	}

}
