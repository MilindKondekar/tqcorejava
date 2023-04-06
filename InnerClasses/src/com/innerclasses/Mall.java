package com.innerclasses;

public class Mall 
{

	private static String mallName= "Pacific";
	private String loc = "Pune";
	
	void doShopping()
	{
		class Cart
		{
		
			String item;
			float price;
			float totalBill =0.0f;
			
			public void addBill(String item, float price)
			{
			
				this.item =item;
				this.price = price;
				System.out.println(this.item+" :"+this.price);
				totalBill+=this.price;
			}
			
			
			public void displayBill()
			{
				
			}
			
		}
		
		
	}
	
	
}
