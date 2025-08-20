package Constructors;

public class SampleCons2 
{
int a,b;
float a1,b1,c1;
	public static void main(String[] args) 
	{
		SampleCons2 cons=new SampleCons2(10,20);
		SampleCons2 cons1=new SampleCons2(10.22f,20.55f,74.5f);
		//cons.SampleCons2();
		//cons1.SampleCons2();
	
	}
	SampleCons2(int a1,int b1)
	{
		a=a1;
		b=b1;
		int sum=a1+b1;
		System.out.println("The sum of integers are:");
	}
	SampleCons2(float a,float b,float c)
	{

		float sumd=a+b+c;
		System.out.println("The sum of float are:");
	}
	
	

}
