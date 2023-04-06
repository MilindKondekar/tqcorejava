package com.logical;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"java","python","Angular"};
		
		
		sortByChar(str);
		sortByLength(str);
		System.out.println(Arrays.toString(str));
		
	}

	private static void sortByChar(String[] str) 
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>1)
				{
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		
	}

	private static void sortByLength(String[] str) 
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		
	}
	
	
}
