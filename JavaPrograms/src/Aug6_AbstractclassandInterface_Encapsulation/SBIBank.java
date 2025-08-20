package Aug6_AbstractclassandInterface_Encapsulation;

public class SBIBank implements Bank//we inherit the method from Bank class
{
	public static void main(String[] args) 
	{
		Bank obj=new SBIBank();// we create object here parent class=child class
		obj.getRateofInterest();//we invoke the method from using that object
	}
	public void getRateofInterest()
	{
		int interest=6;
		System.out.println("Interest rate is:"+interest);
	}
}
//Multiple inheritance is possible here in Abstraction as we can get same method name here from parent class
//We can inherit the getInterestRate method in another class as well like CanaraBank.So multiple inheritance is possible here