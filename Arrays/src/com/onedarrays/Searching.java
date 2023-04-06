package com.onedarrays;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,4,5};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int target = sc.nextInt();
		searching(arr,target);
		
		
	}
	
	static void searching(int arr[],int target)
	{
		boolean ispresent = false;
		int pos =-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				ispresent=true;
				pos = i;
				break;
				
			}
		}
		if(ispresent)
		{
			System.out.println("The number "+target+" is present at "+(pos+1));
		}
	}

}
