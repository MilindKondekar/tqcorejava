package com.objectpassing;

import java.util.Scanner;

public class Bank {
   
	  static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account a1 = new Account("Milind",25000,"SBI");
		
		
		
	}

	 
	
	static void deposit(Account a)
	{
		System.out.println("Enter amount");
		float amount =sc.nextFloat();
		if(a.getBalance()+amount >50000)
		{
			System.out.println("Balance Exceeding 50000 should Enter Pancard Details");
			a.setPanId(sc.next());
		}
		
		a.setBalance(a.getBalance()+amount);
		System.out.println("New Balance :"+a.getBalance());
	}
	
	static void withdraw(Account a)
	{
		System.out.println("Enter amount");
		float amount =sc.nextFloat();
		if(a.getBalance()<=0)
		{
			System.out.println("Insufficeint Balance");
		}
		
		a.setBalance(a.getBalance()-amount);
		System.out.println("New Balance :"+a.getBalance());
	}
	
}
