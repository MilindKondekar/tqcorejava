package com.polymorphism;

public class Area {

	int length;
	int breadth;
	int height;
	
	
	public int  area(int x)
	{
		System.out.println("Area of Square "+x*x);
		return 0;
	}
	
	public void area(int x,int y)
	{
		System.out.println("Area of rectangle "+x*y);
	}
	
	public void area(float x,float y)
	{
		System.out.println("Area of Triangle "+0.5*x*y);
	}
	
	
	public static void main(String[] args)
	{
		Area a1 = new Area();
		a1.area(1);
		
	}
}

 
  



