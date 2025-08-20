package Assignments_Aug16;
import java.util.Scanner;
public class BasicPay 
{
protected float basicpay;
protected float deduction;
protected float bonus;
	public void getpay()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the basicpay of the employee:");
		basicpay=scanner.nextFloat();
		System.out.println("Enter the deduction of the employee:");
		deduction=scanner.nextFloat();
		System.out.println("Enter the bonus of the employee:");
		bonus=scanner.nextFloat();
	}
}
