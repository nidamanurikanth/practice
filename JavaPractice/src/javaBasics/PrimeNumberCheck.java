package javaBasics;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i=scn.nextInt();
		
		if(i%2==0)
		{
			System.out.println("entered number is a prime");
		}
		else 
			System.out.println("entered number is not a prime");

	}

}
