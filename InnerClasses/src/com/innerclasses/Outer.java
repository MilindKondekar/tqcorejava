package com.innerclasses;

public class Outer 
{

	private static int data = 10;
	
	void display()
	{
		class LocalInner
		{
			private int value =20;
			
			//static void show1()
			{
				System.out.println(data);
			}
			
			void show()
			{
				System.out.println();
			}
		}
	}
	
	
	
	
}
