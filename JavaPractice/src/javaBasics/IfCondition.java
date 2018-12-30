package javaBasics;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else 
		{
			System.out.println("b is greater than a");
		}

	}

}
