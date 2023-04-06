package com.onedarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Halfsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,4,5,2,5,1,4,3,12,11,6};
		
		halfsort(arr);
		
		
		
		System.out.println(Arrays.toString(arr));
		//System.out.println("i "+(arr.length/2)+" j "+((arr.length/2)+1));
		
	}
	
   public static  void halfsort(int arr[])
   {
	   for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<(arr.length/2);j++)
			{
				if(arr[i]<arr[j])
				{
					int temp;
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
			
		    if(i>=arr.length/2)
		    {
		    	for(int k=i+1;k<arr.length;k++)
		    	{
		    		if(arr[i]>arr[k])
		    		{
		    			int temp;
		    			temp = arr[i];
		    			arr[i] = arr[k];
		    			arr[k] = temp;
		    			
		    		}
		    		
		    	}		    	
		    	
		    }
				
		}
	   
   }
	
}
