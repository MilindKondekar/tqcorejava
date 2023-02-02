package com.operators;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter two marks");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int bestthree = sc.nextInt();
		
		System.out.println((total>85 || bestthree>90)?"Eligible for Admission":"Not Eligble for admission");
		
	}

}
