package String_methods;
import java.util.Scanner;
public class StringAssignment 
{
	static String s;
	static String reversedword;
	public static void main(String[] args)
	{
		
	boolean palindrome=StringAssignment.checkstring();
	}
	
	public static boolean checkstring()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String to check whether it's palindrome or not:");
		String word=scanner.next();
		s=word.toLowerCase();
		StringBuffer reverse=new StringBuffer(s);
		reversedword=reverse.reverse().toString();
		if(s.equals(reversedword))
		{
			System.out.println("The string is palindrome");
			return true;
		}
		else 
		{
			System.out.println("The string is not palindrome");
			return false;	
		}
	
	}
}
