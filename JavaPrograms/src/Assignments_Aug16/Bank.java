package Assignments_Aug16;
import java.util.Scanner;
public class Bank 
{
private static int bankpin;
private static int validpins[]= {1001,1234,1212};
public static void main(String[] args) 
{
	Bank obj=new Bank();
	obj.setBankpin(1001);
}
public static boolean getpin()
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the valid pin:");
	bankpin=scanner.nextInt();
	if(bankpin==validpins[0])
	{
		return true;
	}
	else
	{
		return false;
	}

	}
	public void setBankpin(int bankpin) 
	{
		this.bankpin = bankpin;
	}
}
