import java.util.Scanner;
public class SampleDoWhile2 {

	public static void main(String[] args) 
	{
		int a[]= {55,88,11,7,66};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value:");
		int target=scanner.nextInt();
		for(int i=0;i<=a.length;i++)
		if(a[i]==target)
		{
			System.out.println("The value is found in:"+i);
			break;
		}
		

	}

}
