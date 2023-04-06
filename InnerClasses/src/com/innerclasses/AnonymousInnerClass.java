package com.innerclasses;

public class AnonymousInnerClass {

	public static void main(String[] args) 
	{
		
		doable d = new doable() {
			public void doit()
			{
				System.out.println("I am doing it");
			}
		};
		d.doit();

	}

}


interface doable
{
	
	 void doit();
	
}


class car
{
	public void drive()
	{
		System.out.println("Driving");
	}
}

abstract class run
{
	abstract void running();
}


