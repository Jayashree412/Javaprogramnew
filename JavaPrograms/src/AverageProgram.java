import java.util.Scanner;

public class AverageProgram 
{
static int sumInt;
static float sumfloat;
static int intavg;
static float floavg;
	public static void main(String[] args) 
	{
		AverageProgram obj=new AverageProgram();
		obj.calculate(0, 0, 0);
		System.out.println("The Sum of integers are:"+obj.sumInt);
		System.out.println("The Average of integers is:"+obj.intavg);
		obj.calculate(0.0f, 0.0f, 0.0f);
		System.out.println("The Sum of float are:"+obj.sumfloat);
		System.out.println("The Average of float is:"+obj.floavg);
	}
	public static void calculate(int a,int b,int c)
	{
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=scanner1.nextInt();
		System.out.println("Enter the value of b:");
		b=scanner1.nextInt();
		System.out.println("Enter the value of b:");
		c=scanner1.nextInt();
		sumInt=a+b+c;
		intavg=(sumInt/3);
	}
	public static void calculate(float x,float y,float z ) 
	{
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=scanner2.nextFloat();
		System.out.println("Enter the value of y:");
		y=scanner2.nextFloat();
		System.out.println("Enter the value of z:");
		z=scanner2.nextFloat();
		sumfloat=x+y+z;
		floavg=(sumfloat/3);
	}
}
