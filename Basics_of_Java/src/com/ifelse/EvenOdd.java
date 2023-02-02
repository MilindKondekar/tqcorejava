package com.ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even No");
		}
		
		else
		{
			System.out.println("Odd No");
		}

	}

}
