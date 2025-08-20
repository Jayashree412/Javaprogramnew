package Array;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value to be found");
		int value=scanner.nextInt();
		int elements[]= {55,887,66,614,874};
		int f=0;
		for(int i=0;i<elements.length;i++)
		{
			if(elements[i]==value)
			{
				f=1;
				System.out.println("The element is found in index"+ " "+i);
			}
		}
			if(f==0)
				{
			System.out.println("The element is not found");
		}
		
		
		

	}

}
