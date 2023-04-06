package com.onedarrays;

public class ArrayMinMax 
{

	
	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		int arr[] = {7,15,3,1,3,4,5,6,7};
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(max <arr[i])
			{
				max=arr[i];
			}
			
			if(min > arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min+" "+max);
		
	}
}
