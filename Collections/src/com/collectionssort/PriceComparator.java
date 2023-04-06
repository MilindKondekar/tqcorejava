package com.collectionssort;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order> {

	
	@Override
	public int compare(Order o1, Order o2) 
	{
		if(o1.getOrderPrice()==o2.getOrderPrice())
		{
			return 0;
		}
		
		
	  else if(o1.getOrderPrice()>o2.getOrderPrice())
		
	    {
			return 1;
		}
		
		else
		 return -1;
	}

}
