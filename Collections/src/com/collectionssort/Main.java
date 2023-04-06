package com.collectionssort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Order> ol = new ArrayList<>();
		
		
		ol.add(new Order(1,"Colgate",2000));
		ol.add(new Order(7,"Fridge",30000));
		ol.add(new Order(3,"Brush",500));		
		ol.add(new Order(2,"Tv",300));
		ol.add(new Order(2,"Mobile",300));
	
		
		for(Order o1:ol)
		{
			System.out.println(o1);
		}
		
		
		System.out.println("==========================");
		Collections.sort(ol,new PriceComparator());
		
		//System.out.println(ol);
		
		//Collections.sort(ol, new IdComparator());
		
		for(Order o1:ol)
		{
			System.out.println(o1);
		}
		
		
		
		
	}

}
