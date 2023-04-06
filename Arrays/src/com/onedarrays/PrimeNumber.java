package com.onedarrays;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,4,5,2,1,5,1,4,1,3};
		checkprime(arr);
		
	}
	
	
	
	static void checkprime(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
		
			boolean isprime = isprime(arr[i]);
			if(isprime)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	static boolean isprime(int num)
	{
		
		boolean isprime = true;
		if( num==0 ||num == 1)
		{
			isprime = false;
			
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isprime=false;
			}
		}
		
		return isprime;
		
		
	}
}
