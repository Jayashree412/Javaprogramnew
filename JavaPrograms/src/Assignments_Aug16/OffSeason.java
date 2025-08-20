package Assignments_Aug16;

import java.util.Scanner;

public class OffSeason extends OnSeason
{

	static double discount;
	static double discountprice;
	public static void main(String[] args) 
	{
		OffSeason obj=new OffSeason();
		obj.billing();
		obj.discount(discountprice);

	}
	public void billing()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the item of item 1:");
		int item1=scanner.nextInt();
		System.out.println("Enter the item of item 2:");
		int item2=scanner.nextInt();
		int total=item1+item2;
		System.out.println("The total is:"+total);
		discountprice=total;	
	}
	public void discount(double total)
	{
		discountprice=(15.0/100)*total;
		System.out.println("The discounted price during offseason is:"+discountprice);
	}

}
