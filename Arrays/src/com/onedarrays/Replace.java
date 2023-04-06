package com.onedarrays;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,-4,5,-6,7};
		replace(arr);
		
		
	}
	
	static void replace(int arr[])
	{
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		
		System.out.println();
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}
}
