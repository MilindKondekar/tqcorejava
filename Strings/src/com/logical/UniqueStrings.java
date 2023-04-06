package com.logical;

import java.util.Scanner;

public class UniqueStrings 
{
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str1[] = {"Milind","Rushi","Vinayak"};
		String str2[] = {"Akash","Shreyas","Vinayak","Rushi","Milind"};
		Duplicates(str1,str2);
	}
	
	
	public static void Duplicates(String str1[],String str2[])
	{
		
		//char ch[] =k.toCharArray();
		
		for(int i=0;i<str2.length;i++)
		{
			
			int cnt=0;
			String s1 = str2[i];
			
			for(int j=0;j<str1.length;j++)
			{
				String s2 = str1[j];
				if(s1.equalsIgnoreCase(s2))
				{
					cnt++;
					break;
					
				}
			}
			
			if(cnt==0)
			{
				System.out.println(str2[i]);
			}
		}
	}
}
