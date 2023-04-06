package com.inheritance;

public class Phone 
{

	int id;
	long phoneNumber;
	int bill;



	public Phone()
	{

	}

	public Phone(int id, long phoneNumber, int bill) 
	{

		this.id = id;
		this.phoneNumber = phoneNumber;
		this.bill = bill;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public long getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public int getBill() 
	{
		return bill;
	}

	public void setBill(int bill) 
	{
		this.bill = bill;
	}


    public void call()
    {
    	System.out.println("Calling");
    }


}
