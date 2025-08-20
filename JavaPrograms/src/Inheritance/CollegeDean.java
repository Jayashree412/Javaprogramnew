package Inheritance;

public class CollegeDean 
{
String dept1="BCA";
String dept2="BCS";
int teacherid=41294;
	public static void main(String[] args) 
	{
		CollegeDean.display();
		CollegeDean obj=new CollegeDean();
		System.out.println("The department dean handles are:"+ obj.dept1);
		System.out.println("The department dean handles are:"+ obj.dept2);
		System.out.println("The staff that handles these dept are:"+ obj.teacherid);
	}
	public static void display()
	{
		System.out.println("This is parent class A");
	}

}
