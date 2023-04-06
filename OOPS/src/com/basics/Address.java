package com.basics;

public class Address {

	int pincode;
	String state;
	String city;
	int plotno;
	
	
	void EnterDetails(int pin, String State, String City, int Plotno)
	{
		pincode = pin;
		state = State;
		city = City;
		plotno = Plotno;
		
		
	}
	
		
	void display()
	{
		
		System.out.println("PIN : "+pincode+" State : "+state+" City :"+city+" Plot :"+plotno);
	}
	
	    // Address a1 = new Address();
	     
	   
}
