
public class Practise1 {

	int x=77;
	static String greeting="hello";
	public static void main(String[] args) 
	{
		Practise1 obj=new Practise1();
		int a=10;
		int b=11;
		System.out.println("The sum is:"+(a+b+obj.x)+greeting);
		sum();

	}
	
	public static void sum()
	{
		Practise1 obj=new Practise1();
		int a = 10;
		int b=55;
		System.out.println("The sum is:"+(a+b)+obj.greeting);
	}

}
