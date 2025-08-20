package Assignments_Aug16;

public class Student 
{
	String studentName;
	int studentRollnumber;
	StudentAddress address;

	public static void main(String[] args) 
	{
		StudentAddress obj1=new StudentAddress("K144","L777","Kochi","Kerala",678582);
		Student obj2=new Student("Joe",122175,obj1);
		obj2.display();

	}
	public Student(String studentName, int studentRollnumber, StudentAddress address) 
	{
		super();
		this.studentName = studentName;
		this.studentRollnumber = studentRollnumber;
		this.address = address;
	}
	public void display()
	{
		System.out.println("The student name is:"+studentName);
		System.out.println("The student roll number is:"+studentRollnumber);
		System.out.println("Student house number is:"+address.houseNo);
		System.out.println("Student street number is:"+address.streetNumber);
		System.out.println("Student City is:"+address.city);
		System.out.println("Student state is:"+address.state);
		System.out.println("Student zipcode is:"+address.zipCode);
	}

}
