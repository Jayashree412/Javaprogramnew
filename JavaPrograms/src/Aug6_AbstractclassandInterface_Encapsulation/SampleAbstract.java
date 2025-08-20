package Aug6_AbstractclassandInterface_Encapsulation;

public abstract class SampleAbstract 
{

	public static void main(String[] args) 
	{
		
		
	}
	public abstract void show();//abstract method

}

//Rules:-
//Abstract class is created with Abstract keyword
//Abstract class can have abstract method(with Abstract keyword and no body) and non abstract method(without abstract keyword and body)
//Abstract class cannot be instantiated-i.e when tried to create an object for the abstract class in subclass it shown error
//Abstract class can have final methods
//Abstract class can have static methods and constructors

//What is abstraction:-
//-We show only details which needs to be shown to user and ignore complicated features here
//-We create abstract method show here in parent class--get interest rate for different banks in parent clas
//-Internal classes are hidden here
//-Parent class only is displayed to user
//How abstract class functions are performed in subclass:-
//-In child class extends the parent class with method overriding

//Uses of abstract class:-
//-Code resuability
//-defining common interface
//-enforcing method implementation
