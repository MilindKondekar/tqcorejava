package com.ifelse;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		float percentage = ((a+b+c+d+e)/5);

		

		if(percentage>=85)
		{
			System.out.println("Excellent");
		}

		else if(percentage>=70)
		{
			System.out.println("Very Good");
		}

		else if(percentage>=55)
		{
			System.out.println("Good");
		}

		else if(percentage>=40)
		{
			System.out.println("Satisfactory");
		}
		
		System.out.println(percentage);
	}

}
