import java.util.Scanner;

public class VotingEligibility 
{
	static int agee;
	static boolean result;
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the age to check whether the candidate is eligible for a voting: ");
    agee = scanner.nextInt();
    boolean result=age(agee);
    if(result)
    {
    	System.out.println("The person is eligible");
    }
    else 
    {
    	System.out.println("The person is not eligible");
    }
    
}

public static boolean age(int age)
{

	if(age>=18)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
}
