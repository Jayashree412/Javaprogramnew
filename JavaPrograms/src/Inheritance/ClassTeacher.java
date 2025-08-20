package Inheritance;

public class ClassTeacher extends HeadofDepartment 
{
char studentsection='B';
String studentgrade="A+";
	public static void main(String[] args) 
	{
		ClassTeacher obj=new ClassTeacher();
		obj.display();
		obj.studentId="715949";
		System.out.println("The ID of the student this class teacher handles:"+ obj.studentId);
		obj.studentName="Samueal";
		System.out.println("The name of the student this class teacher handles:"+ obj.studentName);
		obj.dept1="B.Sc Maths";
		System.out.println("The department this teacher handles:"+ obj.dept1);
		obj.teacherid=8898;
		System.out.println("The ID of the teacher is:"+ obj.teacherid);	
		System.out.println("The student section is:"+ obj.studentsection);
		System.out.println("The student grade is:"+ obj.studentgrade);
		System.out.println("This is child class C");
		
	}

}
