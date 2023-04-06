package com.onedarrays;

import java.util.Scanner;

public class ArrayPassing {

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
		
		change(arr);
		print(arr);
	}

	
	
	public static  void change(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= arr[i]+arr[i];
		}
		
	}

	public static  void print(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
