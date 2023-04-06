package com.logical;

import java.util.Arrays;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am learning java";
		
		reverseWord(str);
	}

	private static void reverseWord(String str) 
	{
		
		String nstr[] = str.split(" ");
		String gstr="";
		char ch;
		for(int i=nstr.length-1;i>=0;i--)
		{
			for(int j=0;j<nstr[i].length();j++)
			{
				ch = nstr[i].charAt(j);
				gstr = ch+gstr;
			}
			nstr[i]=gstr;
			gstr="";
		}
		
		for(int i=nstr.length-1;i>=0;i--)
		{
			System.out.print(nstr[i]+" ");
		}
		
	}

}
