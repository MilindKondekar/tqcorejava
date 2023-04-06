package com.practise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicateEle {

	public static void main(String[] args)
	{

       ArrayList<Integer> al = new ArrayList<>();

       al.add(1);
       al.add(2);
       al.add(3);
       al.add(1);
       al.add(4);
       
       removedupl(al);
	}

	private static void removedupl(ArrayList<Integer> al) 
	{
		LinkedHashSet<Integer> li = new LinkedHashSet<>(al);	
		
		System.out.println(li);
		
	}

}
