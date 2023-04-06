package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class SearchWord {
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
		String str1[] = {"java","python","Angular"};
		System.out.println("Enter String");
		String str2 = sc.next();
		str2 = str2.toLowerCase();
		sortByChar(str1,str2);
		
		
	}

	private static void sortByChar(String[] str1 ,String str2) 
	{
		boolean ispresent = false;
		for(int i=0;i<str1.length;i++)
		{
			String tmp = str1[i];
			tmp = tmp.toLowerCase();
			if(tmp.equals(str2))
			{
				ispresent = true;
			}
		}
		
		if(ispresent)
		{
			System.out.println(str2+" is present");
		}
		
		else
		{
			System.out.println(str2+" is not present");
		}
	}

	
	
	
}
