package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Replace {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("Dotnet");
		list.add("Java");
		
		
		list.remove("Java");
	}

}
