package javaBasics;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scan.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("sunday");
			break;
		}case 2:
		{
			System.out.println("Monday");
			break;
		}case 3:
		{
			System.out.println("Tuesday");
			break;
		}case 4:
		{
			System.out.println("Wednesday");
			break;
		}case 5:
		{
			System.out.println("Thursday");
			break;
		}case 6:
		{
			System.out.println("Friday");
			break;
		}case 7:
		{
			System.out.println("Saturday");
			break;
		}
		default:
			System.out.println("Invalid number");
			
		}

	}

}
