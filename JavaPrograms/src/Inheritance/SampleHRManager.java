package Inheritance;

public class SampleHRManager extends SampleManager
{

	public static void main(String[] args) 
	{
		SampleHRManager resource=new SampleHRManager();
		resource.display();
		resource.empid=5000;
		System.out.println("Employee ID:"+resource.empid);
		resource.name="Shine";
		System.out.println("Employee name:"+resource.name);
		resource.dept="HR";
		System.out.println("Employee dept:"+resource.dept);
		resource.bonus=500;
		System.out.println("Employee bonus is:"+resource.bonus);
		resource.project="BOFA";
		System.out.println("Employee project is:"+resource.project);
		
	}

}
