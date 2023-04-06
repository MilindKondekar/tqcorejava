package com.enums;

public enum MovieSeats 
{

	STANDARD(300),PREMIMUM(400),RECLINER(550);
	
	int price;
	
	private MovieSeats(int price)
	{
		this.price=price;
	}
	
}
