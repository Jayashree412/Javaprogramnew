import java.util.Scanner;
public class PracticePrgm2 
{
int x;
int y;
public static void main(String args[])
{
	PracticePrgm2 obj=new PracticePrgm2();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the value for X:");
	obj.x=scanner.nextInt();
	System.out.println("Enter the value for Y:");
	obj.y=scanner.nextInt();
	int sum=(obj.x+obj.y);
	if(sum>120)
	{
		System.out.println("The value is larger than 120");
		
	}
	else if(sum==120)
	{
		System.out.println("The value is equal to 120");
	}
	else if(sum<120)
	{
		System.out.println("The value is lesser than 120");
	}
}

}
