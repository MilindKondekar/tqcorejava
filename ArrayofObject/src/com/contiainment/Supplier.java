package com.contiainment;

import java.util.Arrays;

public class Supplier 
{

	private int sid;
	private String sname;
	private String phoneNumber;
	private Item item[];
	
	
	Supplier()
	{
		
	}


	public Supplier(int sid, String sname, String phoneNumber, Item[] item) 
	{
		
		this.sid = sid;
		this.sname = sname;
		this.phoneNumber = phoneNumber;
		this.item = item;
	}


	public int getSid() 
	{
		return sid;
	}


	public void setSid(int sid) 
	{
		this.sid = sid;
	}


	public String getSname() 
	{
		return sname;
	}


	public void setSname(String sname) 
	{
		this.sname = sname;
	}


	public String getPhoneNumber() 
	{
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}


	public Item[] getItem() 
	{
		return item;
	}


	public void setItem(Item[] item) 
	{
		this.item = item;
	}


	
	public String toString() 
	{
		return "Supplier sid=" + sid + ", sname=" + sname + ", phoneNumber=" + phoneNumber + ", item="
				+ Arrays.toString(item) ;
	}


	


	
	
	
	
	
	
	
	
	
	
}
