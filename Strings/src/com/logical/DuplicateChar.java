package com.logical;

import java.util.Scanner;

public class DuplicateChar 
{
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		String str = sc.next();
		Duplicates(str);
	}
	
	
	public static void Duplicates(String s)
	{
		String k = s.toLowerCase();
		char ch[] =k.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
			{
				continue;
			}
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					
					System.out.println(ch[i]);
					ch[j] ='\0';
				}
			}
			
		}
	}
}
