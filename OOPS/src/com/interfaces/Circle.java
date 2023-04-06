package com.interfaces;

public class Circle implements Printable,Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing ");
	}

	@Override
	public void print(int r) {
		// TODO Auto-generated method stub
				
		System.out.println("Area of Circle :"+ 3.14*r*r);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
