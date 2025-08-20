package Assignments_Aug16;

import java.util.Scanner;

public class ValidPin 
{
	public static void main(String[] args) 
	{
		Bank obj=new Bank();
		obj.setBankpin(1001);
		System.out.println("The pin 1001 is correct,Please enter the amount");
		obj.setBankpin(1234);
		System.out.println("The pin 1234 is correct,Please enter the amount");
		obj.setBankpin(1212);
		System.out.println("The pin 1212 is correct,Please enter the amount");
		
	}	

}
