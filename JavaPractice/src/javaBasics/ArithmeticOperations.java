package javaBasics;

import java.util.*;

public class ArithmeticOperations
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Sum of two values:"+(a+b));        //Adding of two numbers
		System.out.println("Difference of two numbers:"+(a-b));//Difference of two numbers
		System.out.println("Product of two numbers:"+(a*b));   //Product of two numbers  
		System.out.println("Division of two numbers:"+(a/b));   //Division of two numbers  
		
	}

}
