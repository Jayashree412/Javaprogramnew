package Assignments_Aug16;

public class TotalSalary extends CalculatePay
{
float totalsalary;
	public static void main(String[] args) 
	{
		TotalSalary obj=new TotalSalary();
		obj.getpay();
		System.out.println("The Basicpay is:"+obj.basicpay);
		System.out.println("The Deduction is:"+obj.deduction);
		obj.calculate();
		obj.displaydetails();

	}
	public void displaydetails()
	{
		
		totalsalary=basicpay+deduction+bonus+HRA+PF;
		System.out.println("The total salary is:"+ totalsalary);	
	}

}
