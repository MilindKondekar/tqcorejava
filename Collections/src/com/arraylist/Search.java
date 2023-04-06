package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Search {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		
		list.add("Red");
		list.add("Yellow ");
		list.add("Blue");
		
		
		
		if((list.contains("Blue")))
		{
			System.out.println("It contains Blue");
		}
	}

}
