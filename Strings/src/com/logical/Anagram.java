package com.logical;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.next();
		System.out.println("Enter String 2");
		String str2= sc.next();
		isAnagram(str1,str2);
	}

	private static void isAnagram(String str1, String str2) 
	{
		 boolean isanagram =true;
		if(str1.length()==str2.length())
		{
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			sort(ch1);
			sort(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					isanagram =false;
				}
			}
			
			if(isanagram)
			{
				System.out.println("It is a anagram");
			}
			
			else
			{
				System.out.println("Not a anagram");
			}
		}
		
		else
		{
			System.out.println("Not a anagram");
		}
	}

	private static void sort(char ch[]) 
	{
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		
	}
	
}
