package Aug05_Aggregation;

public class AugPractiseInstitute 
{
	String studentName;
	AugPractiseDepartment department;

	public static void main(String[] args) 
	{
		AugPractiseDepartment a=new AugPractiseDepartment("Computer Science",157,"Ramesh");
		AugPractiseInstitute b=new AugPractiseInstitute("Meera",a);
		b.display();
		
	}
	public void display()
	{
		System.out.println("student name:"+studentName);
		System.out.println("department:"+department.deptName);
		System.out.println("course Id:"+department.courseId);
		System.out.println("HOD name:"+department.hodName);		
		
	}
	public AugPractiseInstitute(String studentName, AugPractiseDepartment department) {
		super();
		this.studentName = studentName;
		this.department = department;
	}

}
