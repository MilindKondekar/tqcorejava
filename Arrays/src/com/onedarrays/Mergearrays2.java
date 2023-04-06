package com.onedarrays;

import java.util.Arrays;

public class Mergearrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {6,7,12,5,20,24,1,3};
	     int arr2[]= {10,20,30};

		int arr3[] = mergearray(arr1,arr2);


		System.out.println(Arrays.toString(arr3));                           /*[6, 7, 12, 5]	    			                                                         [10, 20, 30, 40, 90, 100]
	    			                                                         [6, 20, 12, 40, 90, 100]*/
	}


	public static int [] mergearray(int arr1[],int arr2[])
	{
		int max ,min;
		if(arr1.length>arr2.length)
		{
			max = arr1.length;
			min = arr2.length;
		}

		else 
		{
			max = arr2.length;
			min = arr1.length;
		}

		int arr3[] = new int[max];
		for(int i=0;i<arr3.length;i++)
		{
			if(i<min)
			{
				if(i%2==0)
				{
					arr3[i]=arr1[i];
				}

				else
				{
					arr3[i] = arr2[i];
				}
			}

			if(i>=min)
			{
				if(arr2.length == min)
				{	
					arr3[i] = arr1[i];
				}
				
				else
				{
					arr3[i]= arr2[i];
				}
			}

		}
		return arr3;
	}


}
