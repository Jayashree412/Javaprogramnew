package ThisKeyword;
public class KeyWordThis 
{	
int studentID;
String studentName;
	
	KeyWordThis(int studentID, String studentName) 
	{
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public void display()
	{
		System.out.println("The student Id is:"+studentID);
		System.out.println("The student name is:"+studentName); 
		
	}
	public static void main(String[] args) 
	{
		KeyWordThis s1=new KeyWordThis(1000,"Sara");
		s1.display();
	}

}
//this keyword is a reference keyword. used to identify current object
//Uses of this keyword:-
//1.this keyword is used to refer instance variable--to refer the local variable 
//2.this keyword is used to refer/invoke instance method
//3.this keyword is used to refer/invoke constructor
//4.this keyword is used as a argument in method call
//5.this keyword can be used as return statement
//6.this keyword is used as a argument in constructor call


