package com.logical;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isprime(5));
		//isprime(5);
	}

	
	
	public static void isprime(int n)
	{
		boolean isprime = false;
		if(n==0 || n==1)
		{
			System.out.println("It is not a prime number");
		}
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				break;
			}
			
			else
			{
				isprime=true;
			}
			
			if(isprime)
			{
				System.out.println("It is prime number");
			}
		}
		
	}
	
}
