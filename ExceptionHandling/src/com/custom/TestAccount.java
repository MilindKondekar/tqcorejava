package com.custom;

 class Account 
{

	private String name;
	private int id;
	private float balance;
	
	
	Account()
	{
		
	}


	public Account(String name, int id, float balance) 
	{
		this.name = name;
		this.id = id;
		this.balance = balance;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public int getId() 
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public float getBalance()
	{
		return balance;
	}


	public void setBalance(float balance)
	{
		this.balance = balance;
	}


	public void deposit(float amount)
	{
		this.balance= balance+amount;
	}
	
	
	public void withdraw(int amount)
	{
		if((balance - amount) <0)
		{
			try 
			{
			throw new InsufficinetBal("Insufficient Balance");
			} catch (InsufficinetBal e) 
			{
				
				e.printStackTrace();
			}
		}
	}
	
	
	public String toString() 
	{
		return "Account name=" + name + ", id=" + id + ", balance=" + balance ;
	}
	
	
}

public class TestAccount
{
	public static void main(String[] args)
	{
		
		
		Account a  = new Account();
		a.deposit(900f);
		
		System.out.println(a.getBalance());
		
		a.withdraw(1000);
		
	}

	
}




