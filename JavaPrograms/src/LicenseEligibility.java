import java.util.Scanner;
public class LicenseEligibility 
{

	public static void main(String[] args) 
	{
	Scanner scanner=new Scanner(System.in);
	int age=scanner.nextInt();
	System.out.println("The age is:");
	if(age>=18)
	{
		System.out.println("The candidate is eligible");
	}
	else
	{
		System.out.println("The candidate is not eligible");
	}

	}

}
