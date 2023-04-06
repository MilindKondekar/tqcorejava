package com.logical;

import java.util.Scanner;

public class Encoding {
	
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		String str = sc.next();
		encode(str);
	}
	
	
	private static void encode(String str) 
	{
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
				ch[i]='#';
			}
			
		}
		
		System.out.println(ch);
		
	}
}
