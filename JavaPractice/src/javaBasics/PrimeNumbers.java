package javaBasics;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{

		for (int i=1; i<=100; i++)
		{
			if(prime(i))
			System.out.println(i);
		}
	}
		public static boolean prime(int n)
		{
			if(n<2) 
			return false;
			
			for(int j=2; j<n; j++)
			{
				if(n%j==0) 
				return false;
				
			} return true;
		}
}
