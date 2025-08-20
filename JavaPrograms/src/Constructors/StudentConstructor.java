package Constructors;
import java.util.Scanner;
public class StudentConstructor 
{
static float sum1,sum2;
static String Name1,Name2;
static float mark1,mark2,mark3;
static float markk1,markk2,markk3;
	public static void main(String[] args) 
	{	
		StudentConstructor obj1=new StudentConstructor();
		float temp1=StudentConstructor.studentone();
		System.out.println("The total marks of" + " "+ Name1 + " "+ "is:"+temp1);
		float temp2=StudentConstructor.studenttwo();
		System.out.println("The total marks of" +" "+ Name2 +" "+ "is:"+temp2);
		grade1();
		grade2();
	}
	StudentConstructor(String name1,String name2)
	{
	Scanner scanner3=new Scanner(System.in);
	System.out.println("Enter the first student name:");
	Name1=scanner3.next();
	System.out.println("Enter the second student name:");
	Name2=scanner3.next();
	
	}
	StudentConstructor()
	{
		this(Name1,Name2);
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter the maths mark of first student");
		StudentConstructor.mark1=scanner1.nextFloat();
		System.out.println("Enter the English markof first student");
		StudentConstructor.mark2=scanner1.nextFloat();
		System.out.println("Enter the Social mark of first student");
		StudentConstructor.mark3=scanner1.nextFloat();
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter the Maths mark of Second student");
		StudentConstructor.markk1=scanner2.nextFloat();
		System.out.println("Enter the English mark of Second student");
		StudentConstructor.markk2=scanner2.nextFloat();
		System.out.println("Enter the Social mark of Second student");
		StudentConstructor.markk3=scanner2.nextFloat();		
	}
	
	public static float studentone()
	{
		sum1=mark1+mark2+mark3;
		return sum1;
		
	}
	public static float studenttwo()
	{
		sum2=markk1+markk2+markk3;
		return sum2;	
	}
	public static void grade1() 
	{
        System.out.print(Name1 + "'s grade: ");
        if (sum1 >= 250) 
        {
            System.out.println("A+");
        } 
        else if (sum1 >= 175) 
        {
            System.out.println("B");
        } 
        else if (sum1 >= 110) 
        {
            System.out.println("C");
        } else 
        {
            System.out.println("Failed");
        }
    }
	
	 public static void grade2() 
	 {
	       System.out.print(Name2 + "'s grade: ");
	        if (sum2 >= 250) 
	        {
	            System.out.println("A+");
	        } 
	        else if (sum2 >= 175) 
	        {
	            System.out.println("B");
	        } 
	        else if (sum2 >= 110) 
	        {
	            System.out.println("C");
	        } else 
	        {
	            System.out.println("Failed");	
	        }
	 }
}
