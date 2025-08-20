package Inheritance;

public class StudentLeader extends HeadofDepartment
{
String studentMajor="Accounts";
String studentAdd="Al Rahba,Dubai";
	public static void main(String[] args) 
	{
		StudentLeader obj=new StudentLeader();
		obj.display();
		obj.dept1="BBA";
		System.out.println("The department student belongs to:"+ obj.dept1);
		obj.teacherid=30124;
		System.out.println("The staff id is :"+ obj.teacherid);
		System.out.println("The student id is :"+ obj.studentMajor);
		System.out.println("The Student name is :"+ obj.studentAdd);
		System.out.println("This is the child class D of parent class B");

	}

}
