package Assignments_Aug16;
import java.util.Scanner;
public class CalculatePay extends BasicPay
{
float HRA;
float PF;
public static void main(String[] args)
{
	CalculatePay obj=new CalculatePay();
	obj.getpay();
	obj.calculate();
}
public void calculate()
{
	HRA=basicpay*0.05f;
	System.out.println("The HRA is:"+ HRA);
	PF=basicpay*0.20f;
	System.out.println("The PF is:"+ PF);
}
}
