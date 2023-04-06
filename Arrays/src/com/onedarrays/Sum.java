package com.onedarrays;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter five numbers ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		 sumOfEven(arr);
		sumOfodd( arr);
	}

	
	
	public static  void sumOfEven(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Even number Sum is"+sum);
	}
	
	public static void sumOfodd(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Odd number Sum is"+sum);
	}
	
	
}
