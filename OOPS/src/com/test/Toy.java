package com.test;

public class Toy {

	int id;
	static
	{
		System.out.println("Inside Static block");
	}
	
	
	{
		System.out.println("Inside instance block");
	}
	
	public Toy()
	{
		System.out.println("Inside constructor 1");
	}
	
	public Toy(int id)
	{
		System.out.println("Inside constructor ");
		this.id=id;
	}
	
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy(2);
	}
}
