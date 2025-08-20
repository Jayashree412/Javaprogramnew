import java.util.Scanner;
public class Palindrome 
{
static int real;
static int reversed;
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be converted to palidrome:");
		real=scanner.nextInt();
		Palindrome.reverse(real);
		Palindrome.palindrome();
	}
	public static void reverse(int temp)
	{
		real=temp;
		while(temp!=0)
		{
			int a=temp%10;
			reversed=reversed*10+a;
			temp=temp/10;			
		}
			System.out.println("The palindrome of the given number is:"+ reversed);
		}
	public static void palindrome()
	{ 
		if (real == reversed) 
	{ 
	System.out.println(real + " is a palindrome number."); 
	} 
	else 
	{ 
		System.out.println(real + " is not a palindrome number."); }
	}
	}
	


