package com.collectionssort;

public class Order //implements Comparable<Order>
{

	 private int orderId;
	 private String orderName;
	 private int orderPrice;
	
	 
	 public Order()
	 {
		super();
		
	 }


	public Order(int orderId, String orderName, int orderPrice) 
	{
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public int getOrderPrice() {
		return orderPrice;
	}


	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderPrice=" + orderPrice + "]";
	}


	/*@Override
	public int compareTo(Order o) 
	{
		if(this.orderId==o.orderId)
		{
			return this.orderName.compareTo(o.orderName);
		}
		
		else if(this.orderId>o.orderId)
		{
			return 1;
		}
		
		else
			return -1;
	}*/
	  
	 	
}
