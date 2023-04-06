package com.linklist;

import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args)
	{
		
        LinkedList<String> l1 = new LinkedList<>();
        // Insertion
		l1.add("Red");
		l1.addFirst("Violet");
		l1.add("Indigo");
		l1.addLast("Blue");
		
		l1.offerLast("Grey");
		
		l1.offerFirst("Dark Red");
		l1.add(3, "MidCol");
		
		//Deletion
		
		l1.remove();
		
		
		System.out.println(l1);
		
		l1.remove();// removes first element
		
		System.out.println(l1);
		
		l1.poll();
		System.out.println(l1);
		
		l1.pollLast();
		
		
		//Retrieve
		
		l1.getFirst(); //Retrieves first element
		//l1.getLast();
		//l1.get(1);
		
		System.out.println(l1);
		
		l1.peekFirst();    //Retrieves first element
		
		System.out.println(l1);
		
		l1.peekLast();
		
		System.out.println(l1);
		
	}

}
