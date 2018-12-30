package javaBasics;

public class SwappingTwoValues {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		 
		System.out.println("Values of a: "+a+" and b: "+b );
		
		
		//Swapping values using 3rd variable
		
		int c=a;  	//c=10
		    a=b;	//a=20
		    b=c;	//b=10
		    
		// Without using 3rd variable and using '+' operator
		    
		    a=a+b;	//a=30
		    b=a-b;	//b=10
		    a=a-b;	//a=20
		    
		 // Without using 3rd variable and using '*' operator   
				
		a= a*b;  	// a=200
		b= a/b;  	// b=10
		a= a/b;	 	// a=20
		
		System.out.println("After swapping values of a: "+a+" and b: "+b);
	}

}
