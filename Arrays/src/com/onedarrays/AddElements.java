package com.onedarrays;

import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		enterArray();
				
	}
	
	static void enterArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter numbers");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		alternate(arr);
		
	}
	
	
	
	static void alternate(int arr[])
	{
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		
		  System.out.println();
		  
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
