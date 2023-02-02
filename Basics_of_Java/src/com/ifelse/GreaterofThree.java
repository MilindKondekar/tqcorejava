package com.ifelse;

import java.util.Scanner;

public class GreaterofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater");
		}
	
		else if(c>a && c>b)
		{
			System.out.println(c+" is greater");
		}
		
	}

}
