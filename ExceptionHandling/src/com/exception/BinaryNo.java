package com.exception;

import java.util.Scanner;

public class BinaryNo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary number");
		int x = sc.nextInt();
		
		binary(x);
	}

	private static void binary(int x) 
	{
		while(x!=0)
		{
			int j = x%10;
			if(j>1 || j<0)
			{
				System.out.println("Not a binary no");
				throw new ArithmeticException();
			}
			x = x/10;
		}
		
		System.out.println("It is binary");
		
	}
}
