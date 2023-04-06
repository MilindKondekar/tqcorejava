package com.arraylist;

import java.util.ArrayList;

public class MethodsOfArraylist {

	public static void main(String[] args) 
	{
		
      ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("Python");
		list1.add("Dotnet");
		
		
		list1.add(2,"Html");
		System.out.println(list1);
		
	ArrayList<String> list2 = new ArrayList<>();

	  list2.add("Asp.net");
	  list2.add("vb.net");
	  
	  list1.addAll(2,list2);
	  System.out.println(list1);
	}

}
