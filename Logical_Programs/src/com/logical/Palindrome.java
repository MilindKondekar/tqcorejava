package com.logical;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindrome(151);
	}

	
	public static void palindrome(int num)
	{
		int x=0;
		int reverse=0;
		int a=1;
		int num2=num;
		while(num!=0)
		{
			x=num%10;
			System.out.println(x);
			reverse = (reverse *10)+x;
			num=num/10;
		}
		System.out.println("reverse "+reverse);
		if(num2==reverse)
	
			{
			  System.out.println("It is a Palindrome");			
			}
		
		else
		{
			System.out.println("It is not a palindrome");
			System.out.println(reverse);
		}
	}
	
}
