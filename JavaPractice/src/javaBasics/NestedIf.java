package javaBasics;

public class NestedIf{

	public static void main(String[] args) {
		
		int a[]={10,100};
		
		if(a[1]>a[0])
		{
			System.out.println(+a[1]+ " is greater than "+a[0]);
		}
		else if(a[0]>a[1])
		{
			System.out.println(+a[0]+" is greater than "+a[1]);
		}
		else
		{
			System.out.println("both are same");
		}

	}

}
