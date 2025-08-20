package Inheritance;
public class SampleEmployee 
{
int empid;
String name;
String dept;
	public static void main(String[] args) 
	{
		SampleEmployee.display();
		
	}
	public static void display()
	{
		System.out.println("This is employee class");
		SampleEmployee obj=new SampleEmployee();
		obj.empid=6222;
		System.out.println("Employee ID:"+obj.empid);
		obj.name="Jane";
		System.out.println("Employee name:"+obj.name);
		obj.dept="Finance";
		System.out.println("Employee name:"+obj.dept);
		
	}

}
