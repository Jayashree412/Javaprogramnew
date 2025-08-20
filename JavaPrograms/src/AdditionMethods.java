
public class AdditionMethods {

	public static void main(String[] args) 
	{
		AdditionMethods sum2=new AdditionMethods();
		sum2.sum(1,20);
		//System.out.println("The addition of a and b are:"+sum2.sum());
		double sum1=AdditionMethods.sum();
		System.out.println("The addition of c and d are:"+sum1);
		}
		public void sum(int a, int b)
		{
		a=1;
		b=20;
		int add1=a+b;
		System.out.println("The addition of a and b are:"+add1);
		}
		public static double sum()
		{
		double c=30.22f;
		double d=20.66f;
		double add2=c+d;
		return add2;

	}

}
