package Constructors;

public class SampleConstruct {
	
	SampleConstruct()
	{
		//this(10,20);
		System.out.println("default Constructor");
	}
	SampleConstruct(int a ,int b)//formal argument
	{
		this();
		System.out.println("The sum of a and b is:"+ (a+b));
	}
	
	public static void main(String[] args) 
	{
		//SampleConstruct e1=new SampleConstruct();
		SampleConstruct e2=new SampleConstruct(10,20);//actual argument	
	}

}
		//constructor Special type of method
		//Constructor name is same as class name
		//Constructor is invoked at the time of object creation
		//2 types--Default constructor and parameterized constructor
		//use of constructor--to initialize an object
		//for eg. student is an object which has adding values and variables to that object like student ID,name, age
		//Object Student-ID,name,Age-Object specific details which gets value for these data(name,age) is called as initialization 