import java.util.Scanner;
public class FactorialPrgm 
{
    
    public static void main(String[] args) 
    {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the number to find the factorial");
    	int num=scanner.nextInt();
    	FactorialPrgm obj=new FactorialPrgm();
        obj.printFactorial(num);  
    }
    public long calculateFactorial(int number) 
    {
        long fact = 1;
        for (int i = 1; i <= number; i++) 
        {
            fact *= i;
        }
        return fact;
    }
    public void printFactorial(int number) 
    {
    	long result = this.calculateFactorial(number); 
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
