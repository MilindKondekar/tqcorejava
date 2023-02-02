package com.operators;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = scan.nextInt();
		
		scan.close();

		//ternary operator to check number
		String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);
		
	}

}
