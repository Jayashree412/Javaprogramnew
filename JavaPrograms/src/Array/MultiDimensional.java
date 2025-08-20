package Array;

public class MultiDimensional 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		for(int i=0;i<2;i++)//to iterate a row
		{
		for(int j=0;j<2;j++)// to iterate a column
		{
			System.out.print(a[i][j]);
		}
		}
		int b[][]={{1,2},{3,4}};
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
			System.out.println(b[i][j]);
			System.out.println(b[i][j]);
		}

	}

}
}
