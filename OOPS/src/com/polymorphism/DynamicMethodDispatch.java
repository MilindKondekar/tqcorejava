package com.polymorphism;

public class DynamicMethodDispatch 
{
   
	public static void main(String[] args) 
	{
	  
	 /* b.Deposit(1000);
	  b.DisplayBalance();*/
    Bank  b = new Current();
	  b.Deposit(1000);
	  b.DisplayBalance();
	}
	
}


class Bank
{
	float amount;
	float balance;
	
	public Bank(float amount, float balance) {
		
		this.amount = amount;
		this.balance = balance;
	}


	public Bank() {
		// TODO Auto-generated constructor stub
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance2) {
		this.balance = balance2;
	}


	void Deposit(int bal)
	{
		this.balance = bal;
	}	
	
	
	void DisplayBalance()
	{
		System.out.println(balance);
	}
	
}

class Current extends Bank
{
 
	public Current()
	{
		super();
	}
	
	public Current(float amount, float balance) 
	{
		super(amount, balance);
		// TODO Auto-generated constructor stub
	}

	
	void Deposit(int bal)
	{
		balance = (float) (bal + (bal *0.5));
		setBalance(balance);
		
	}	
	
	void Display()
	{
		
		System.out.println(getBalance());
	}
}


class Savings extends Bank
{
	
	public Savings(float amount, float balance) {
		super(amount, balance);
		// TODO Auto-generated constructor stub
	}

	void Deposit(int bal)
	{
		balance = balance + bal;
	}	
	
	void Display()
	{
		balance = (int) (balance+(balance*0.03));
		System.out.println(balance);
	}
}