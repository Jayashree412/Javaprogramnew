package samplePackage1;

public class SampleClassA 
{
	String name="Noah";

	public static void main(String[] args) 
	{
		SampleClassA obj=new SampleClassA();
		obj.details();
		SampleClassA.display();	
	}
	protected static void display()
	{
		System.out.println("This is class A");
	}
	protected void details()
	{
		System.out.println("This is instance method with name:"+ name);
	}

}
//Public--Globally accessible
//default--Accessible by package and other classes inside the package
//private-Accessible by only the class where it is defined but not inside the whole package
//protected-Accessible by package and classes inside the package. But only if we have child in different package