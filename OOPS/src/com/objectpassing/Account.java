package com.objectpassing;

public class Account 
{

	private String panid;
	private String name;
	private float balance;
	private String bankname;
	
	
	
	public Account(String name, float balance, String bankname) 
	{
		
		
		this.name = name;
		this.balance = balance;
		this.bankname = bankname;
	}


	public String getPanId() 
	{
		return panid;
	}


	public void setPanId(String id) 
	{
		this.panid = id;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public float getBalance() 
	{
		return balance;
	}


	public void setBalance(float balance) 
	{
		this.balance = balance;
	}


	public String getBankname() 
	{
		return bankname;
	}


	public void setBankname(String bankname) 
	{
		this.bankname = bankname;
	}


	
	
	
	
	
}
