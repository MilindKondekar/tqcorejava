package com.vectors;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		

		Vector<String>  v = new Vector<>(10,5); // refactoring size
		
		v.add("Red ");
		v.add("Yellow");
		v.add("Blue");
		
		v.add("Voilet ");
		v.add("Indigo");
		v.add("Purple");
		
		v.add("Black ");
		v.add("skyblue");
		v.add("darkred");
		
		v.add("darkred");
		v.add("darkred");
		
		v.ensureCapacity(20);// minimum capacity
		
		System.out.println(v.capacity()); // only present in vector
		
		System.out.println(v.get(4));
		
		System.out.println(v.elementAt(4));//legacy methods
		
		System.out.println(v.set(3, "darkOrange"));// return previous element before setting new
		
		
	}

}
