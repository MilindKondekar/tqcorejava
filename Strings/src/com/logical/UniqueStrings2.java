package com.logical;

import java.util.Scanner;

public class UniqueStrings2 
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
		boolean found;
		for(String s1 :str2)
		{
			found =false;
			
			for(String s2:str1 )
			{
				if(s1.equalsIgnoreCase(s2))
				{
					found =true;
					break;
				}
			}
			
			if(!found)
			{
				System.out.println(s1);
			}
		}
		
		
	}
}
