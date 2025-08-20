package Array;

public class ArrayExamples {

	public static void main(String[] args) 
	{
		int a[]=new int[10];//0 and 1 indexes of this array
		/*a[0]=1;
		a[1]=2;
		a[2]=13;
		for(int i=0;i<10;i++)
		{
		System.out.println(a[i]);
		}*/
		int b[]={1,2,3,4};
		/*for(int j=0;j<b.length;j++)
		{
		System.out.println(b[j]);
		}*/
		for(int k:b)//for(datatype variable:arrayname)
		{
		System.out.println(k);
		}

	}

}
