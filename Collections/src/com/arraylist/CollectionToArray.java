package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) 
	{
			
		String colour[] = {"Red","Blue","Black","Yellow"};
		
		//1 st way
		List<String> sl = Arrays.asList(colour);
		//System.out.println(sl);
		
		//2nd way
		ArrayList<String>  al = new ArrayList<>(Arrays.asList(colour));
		//System.out.println(al);
		
		//3 rd way
		ArrayList<String>  al2 = new ArrayList<>();
		Collections.addAll(al2, colour);

		System.out.println(al2);
		
		System.out.println("Array List To Array");
		
		
		
		
	}

}
