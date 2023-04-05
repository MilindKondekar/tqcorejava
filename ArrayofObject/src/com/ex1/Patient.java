package com.ex1;

public class Patient 
{

	private int pId;
	private String pName;
	
	Patient()
	{
		
	}
	
	Patient(int pId, String pName)
	{
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
	
   public void setpName(String pName)
   {
	   this.pName = pName;
   }
	
   public String getpName()
   {
	   return pName;
   }
	
   public String toString()
   {
	   return "Patient Name:"+pName+" Patient Id :"+pId;
   }
}
