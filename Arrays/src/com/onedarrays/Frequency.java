package com.onedarrays;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//enterArray();
		int arr[] = {2,4,5,2,1,5,1,4,1};
		freq(arr);
	}


	/*static void enterArray()
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

		freq(arr);

	}*/


	static void freq(int arr[])
	{

		int cnt=1;
		int x=0;

		for(int i=0;i<arr.length;i++)
		{

			if(arr[i]=='\0')
				continue;     // {2,4,5,2,1,5,1,4};


			for(int j=i+1;j<arr.length;j++)
			{

				if(arr[i]==arr[j])
				{ 
					x = arr[i];
					arr[j]='\0';
					cnt++;
				}

			}
			System.out.println(x+" : "+cnt);
			cnt=1;
		}

	}








}
