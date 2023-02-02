package com.ifelse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		
		else
		{
			System.out.println(b+" is greater");
		}
	}

}
