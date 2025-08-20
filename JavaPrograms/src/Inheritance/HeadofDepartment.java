package Inheritance;

public class HeadofDepartment extends CollegeDean
{
String studentId="1222k1198";
String studentName="Jay";

	public static void main(String[] args) 
	{
		HeadofDepartment obj=new HeadofDepartment();
		obj.display();
		obj.dept1="B.A English";
		System.out.println("The department dean handles is:"+ obj.dept1);
		obj.teacherid=28890;
		System.out.println("The staff id is :"+ obj.teacherid);
		System.out.println("The student id is :"+ obj.studentId);
		System.out.println("The Student name is :"+ obj.studentName);
		System.out.println("This is child class B");
		
	}

}
