package MethodOverriding_SuperKeyword;

public class SampleChildClassB  extends SampleParentClassA
{
int childno=887897;
String childlabel="Jay";
	public static void main(String[] args) 
	{
		SampleChildClassB obj=new SampleChildClassB();
		obj.display();
		obj.show();
		obj.showexample();		
	}
	public void display()//method overriding-creating a method name same as parent class and calling it in main method invokes the child class only
	{
		System.out.println("The child name is:"+childno);
		System.out.println("The child Id is:"+childlabel);
	}
	public void show()
	{
		System.out.println("parentid:"+super.parentid);
		System.out.println("parentname:"+super.parentname);
	}
	public void showexample()
	{
		super.sample();
	}
	SampleChildClassB()
	{
		super(10);//by default constructor first line will be super only
	}
	/*SampleChildClassB(int age)
	{
		
	}*/
	
}
