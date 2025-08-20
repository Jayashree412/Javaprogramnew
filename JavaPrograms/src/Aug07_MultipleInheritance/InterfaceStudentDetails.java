package Aug07_MultipleInheritance;

public class InterfaceStudentDetails implements InterfaceOne,InterfaceTwo//Multiple Inheritance by calling both classes
{

	public static void main(String[] args) 
	{
		InterfaceStudentDetails obj=new InterfaceStudentDetails();
		InterfaceOne.getstudentmarks();//to call the default  method from Interface 1 with that respective method name
		InterfaceTwo.getstudentaddress();//to call the static method from Interface 2 with that respective method name
		//obj.getstudentmarks();
		//obj.getstudentaddress();
		
	}
	/*public void getstudentmarks()//Method overriding from parent A
	{
		int mark1=50;
		int mark2=65;
		int total=mark1+mark2;
		System.out.println("The total student mark is:"+total);
	}
	public void getstudentaddress()//Method overriding from parent B
	{
		String studentcity="Palakkad";
		String studentstate="Kerala";
		System.out.println("The student address is:"+ studentcity + "" + studentstate);
	}*/
	

}
