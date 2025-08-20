import java.util.Scanner;
public class DiscountPrgm 
{
static double price,price1,price2;
static double discount;
static double total;
	public static void main(String[] args) 
	{
		DiscountPrgm.items(price, price1, price2);
		DiscountPrgm Fin=new DiscountPrgm();
		double bill=Fin.discount();
		System.out.println("The total discounted price is:"+bill);
	}
	public static void items(double a,double b,double c)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the price of item 1:");
		price=scanner.nextDouble();
		System.out.println("Enter the price of item 2:");
		price1=scanner.nextDouble();
		System.out.println("Enter the price of item 3:");
		price2=scanner.nextDouble();
	}
	public static void totalamount()
	{
		total=price+price1+price2;
		System.out.println("The Total is:"+ total);
	}
	public double discount()
	{
		DiscountPrgm.totalamount();
		if(total>5000)
		{
			discount=total*(20.0/100.0);
			return discount;
		}
		else 
		{
			System.out.println("No Discount, Sorry!");
		}
		return 0;	
		
	}
	
	}


