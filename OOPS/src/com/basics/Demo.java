package com.basics;

public class Demo {

	int x =12;
	private int y = 13;
	public int z =12;


	void display()
	{
		System.out.println("Defaut specifier");
	}

	public void show()
	{
		System.out.println("Public specifier");
	}

	private void print()
	{
		System.out.println("Private specifier");
	}


	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		//d1.x ;
		//d1.y;
		//d1.z;
		d1.display();
		d1.print();
		d1.show();
		
	}


}
