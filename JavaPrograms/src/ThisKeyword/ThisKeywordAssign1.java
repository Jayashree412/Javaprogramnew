package ThisKeyword;
import java.util.Scanner;
public class ThisKeywordAssign1 
{
	
	int number;
	int reverse;

	public static void main(String[] args) 
	{
		ThisKeywordAssign1 obj=new ThisKeywordAssign1(445785);

	}
	ThisKeywordAssign1()
	{
		System.out.println("The number is:");
	}
	ThisKeywordAssign1(int number)
	{
		this.number=number;
		reverse=0;
		while(number!=0)
		{
			int res=number%10;
			reverse=reverse*10+res;
			number=number/10;
		}
	System.out.println("The reverse of the number is:"+reverse);
	}
	
}
