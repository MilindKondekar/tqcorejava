package com.abstraction;

public class TestLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}



class Homeloan extends Loan
{
	int amount;
	
	Homeloan(int loanID,String loanType,String Name,int amount)
	{
		super(loanID,loanType,loanType, loanAmount);
		this.amount =amount;
	}

	@Override
	void calculateInterest()
	{
		int interest = (int) (amount *0.1);
		System.out.println(interest);
		
	}
	
	
}
