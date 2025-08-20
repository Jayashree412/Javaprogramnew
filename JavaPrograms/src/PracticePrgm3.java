import java.util.Scanner;
public class PracticePrgm3 
{
static int level;
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any levels of game");
		level=scanner.nextInt();
		switch(level)
		{
			case 1:
				System.out.println("The level is Easy");
				break;
			case 2:
				System.out.println("The level is mediate");
				break;
			case 3:
				System.out.println("The level is Tough");
				break;
			case 4:
				System.out.println("The level is very badly tough");
				break;
			
		}
		

	}

}
