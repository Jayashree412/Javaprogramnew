package Assignments_Aug16;

public class AdditionChild extends Addition
{
int divisionresult;
	public static void main(String[] args) 
	{
		AdditionChild obj=new AdditionChild();
		obj.displayadd();
		obj.division();

	}
	public void displayadd()
	{
		addresult=super.addition();
		System.out.println("The sum if 2 numbers are:"+addresult);
	}
	public void division()
	{
		if(addresult%10==0)
		{
			System.out.println("The number is divisible by 10");
			
		}
		else 
		{
			System.out.println("The number is not divisible by 10");
			
		}
		
	}
}
