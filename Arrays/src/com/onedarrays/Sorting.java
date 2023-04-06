package com.onedarrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,1,7,6,4,8,3,9};
		
		beforeSorting(arr);
		System.out.println();
		System.out.println("---------------------");
		afterSorting(arr);
	
	}

	
	static void beforeSorting(int arr[])
	{
		
		for(int x: arr)
		{
		System.out.print(x+" ");
		}
		
	}
	
	
	static void afterSorting(int arr[])
	{
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			    if(arr[i]>arr[j])
			    {
			    	temp = arr[i];
			    	arr[i]=arr[j];
			    	arr[j]=temp;
			    }
			}
		}
		
		
		for(int x: arr)
		{
		System.out.print(x+" ");
		}
	}
	
	
}
