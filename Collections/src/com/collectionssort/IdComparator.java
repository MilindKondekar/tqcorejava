package com.collectionssort;

import java.util.Comparator;

public class IdComparator implements Comparator<Order> 
{

	@Override
	public int compare(Order o1, Order o2)
	{
	   if(o1.getOrderId()==o2.getOrderId())
	   {
		   return o1.getOrderName().compareToIgnoreCase(o2.getOrderName());
	   }
		
	   else if(o1.getOrderId()>o2.getOrderId())
	   {
		   return 1;
	   }
	   
	   else
		return -1;
	}

}
