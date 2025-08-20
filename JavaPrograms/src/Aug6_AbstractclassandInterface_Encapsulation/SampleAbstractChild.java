package Aug6_AbstractclassandInterface_Encapsulation;

public class SampleAbstractChild extends SampleAbstract
{

	public static void main(String[] args) 
	{
		SampleAbstract obj=new SampleAbstractChild();
		obj.show();
		//SampleAbstract obj2=new SampleAbstract();//we get here error as we cannot instantiate abstract class
	}
	public void show()//Overrides the parent class method
	{
		System.out.println("This is child class");
	}
}
//This is child class-we get abstract methods from parent class here