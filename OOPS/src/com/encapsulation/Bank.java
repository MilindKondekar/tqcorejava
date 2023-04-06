package com.encapsulation;

public class Bank {

	private int  accountNo;
	private String accountholder;
	private long balance;
	private String bankName;
	
	
	public Bank(int accountNo, String accountholder, long balance, String bankName) 
	{	
		this.accountNo = accountNo;
		this.accountholder = accountholder;
		this.balance = balance;
		this.bankName = bankName;
	}

	public Bank( String accountholder, long balance, String bankName) 
	{	
		this.accountNo = accountNo;
		this.accountholder = accountholder;
		this.balance = balance;
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public int getAccountNo() 
	{
		return accountNo;
	}


	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}


	public String getAccountholder()
	{
		return accountholder;
	}


	public void setAccountholder(String accountholder)
	{
		this.accountholder = accountholder;
	}


	public long getBalance() 
	{
		return balance;
	}


	public void setBalance(long balance) 
	{
		this.balance = balance;
	}
	
	
	
}
