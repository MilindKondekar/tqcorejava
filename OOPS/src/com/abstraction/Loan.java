package com.abstraction;

public abstract class Loan 
{

	int loanId;
	String loanType;
	String Name;
	static float loanAmount;
	
	public Loan(int loanID,String loanType,String Name,float loanAmount)
	{
		this.loanId = loanID;
		this.loanType = loanType;
		this.Name = Name;
		this.loanAmount=loanAmount;
	}
	
	
	abstract void calculateInterest();
	
	void DisplayDetails()
	{
	 System.out.println("Name :"+Name+"Loan Type "+loanType);	
	}
	
}
