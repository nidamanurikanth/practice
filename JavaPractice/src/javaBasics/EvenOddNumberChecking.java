package javaBasics;

import java.util.Scanner;

public class EvenOddNumberChecking 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number to check even number: ");
		int i=sc.nextInt();
		
		if(i%2==0)
			System.out.println("Entered numbered is a even number");
		else 
			System.out.println("Entered number is a odd number");
		
		
	}

}
