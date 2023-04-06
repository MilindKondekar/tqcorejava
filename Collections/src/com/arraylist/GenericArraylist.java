package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArraylist {

	public static void main(String[] args) 
	{
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		//list1.add("Java");
		//list1.add(12.5f);          //compile time error due to generic type  ...(type safety)

	}

}
