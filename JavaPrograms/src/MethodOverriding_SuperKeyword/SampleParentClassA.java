package MethodOverriding_SuperKeyword;

public class SampleParentClassA 
{
	String parentname="Mike";
	int parentid=55;

	public static void main(String[] args) 
	{
		SampleParentClassA obj=new SampleParentClassA();
		obj.display();

	}
	public void display()//method overriding-using same name of method in child class
	{
		System.out.println("The parent name is:"+parentname);
		System.out.println("The parent ID is:"+parentid);
	}
	public void sample()
	{
		System.out.println("This is with super keyword");
	}
	SampleParentClassA()
	{
		System.out.println("This is parent constrcutor");
	}
	SampleParentClassA(int age1)
	{
		int age=age1;
		System.out.println("The age is:"+age);
	}
	

	

}
