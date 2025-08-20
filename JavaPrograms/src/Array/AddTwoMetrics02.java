package Array;
import java.util.Scanner;
class AddTwoMetrics02 
{

	public static void main(String args[]) 
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of rows :");
	int row=scanner.nextInt();
	System.out.println("Enter the number of columns :");
	int col=scanner.nextInt();
	int A[][]=new int[row][col];
	int B[][]=new int[row][col];
	int C[][]=new int[row][col];
	System.out.println("Enter the values for matrix A:");
	{
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				A[i][j]=scanner.nextInt();
			}
		}
	}
	System.out.println("Enter the values for matrix B:");
	{
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				B[i][j]=scanner.nextInt();
			}
		}
	}
	System.out.println("The sum of A and B is:");
	{
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(C[i][j]);
			}
	}
	}
	}
	

}
