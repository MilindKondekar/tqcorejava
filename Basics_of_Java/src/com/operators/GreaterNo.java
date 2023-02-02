package com.operators;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		
		//String result = num1>num2 ?"num1 is greater" : "num2 is greater";
		//System.out.println(result);
		System.out.println(num1>num2 ?num1:num2);
	}

}
