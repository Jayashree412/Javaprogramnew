package Assignments_Aug16;
import java.util.Scanner;
public class Addition 
{
	int a;
	int b;
	protected int addresult;

	public static void main(String[] args) 
	{
		Addition add=new Addition();
		System.out.println("The sum of addition of 2 numbers is:"+add.addition());

	}
	public int addition()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number for value a:");
		a=scanner.nextInt();
		System.out.println("Enter the number for value b:");
		b=scanner.nextInt();
		int addresult=a+b;
		return addresult;
	}

}
