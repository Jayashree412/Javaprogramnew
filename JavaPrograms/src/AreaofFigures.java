import java.util.Scanner;
public class AreaofFigures
{
static float Pi=3.142f;
static float areaofcircle;
static int areaofrectangle;
static double areaofsquare;
	public static void main(String[] args) 
	{
		AreaofFigures obj1=new AreaofFigures();
		obj1.circle();
		System.out.println("The area of circle is:"+areaofcircle);
		obj1.rectangle();
		System.out.println("The area of rectange is:"+areaofrectangle);
		obj1.square();
		System.out.println("The area of square is:"+areaofsquare);
	}
	public static void circle()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		float radius=scanner.nextFloat();
		areaofcircle=Pi*radius*radius;
	}
	public static void rectangle()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int length=scanner.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int width=scanner.nextInt();
		areaofrectangle=length*width;	
	}
	public static void square()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the area of the side a:");
		double a=scanner.nextDouble();
		System.out.println("Enter the area of the side b:");
		double b=scanner.nextDouble();
		areaofsquare=a*b;
	}

}
