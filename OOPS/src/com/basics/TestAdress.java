package com.basics;

import java.util.Scanner;

public class TestAdress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pin");
		int pin = sc.nextInt();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter Plot no");
		int plot = sc.nextInt();
		
		Address ad = new Address();
		ad.EnterDetails(pin,state,city,plot);
		ad.display();
		
	}

}
