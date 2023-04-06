package com.interfaces;

public interface Movable {

	int speed =90;
	
	public void move();
	
}

class Person implements Movable
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("Person is moving with a Speed :"+speed);
	}
	
	
}

class Car implements Movable
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving with a Speed :"+speed);
	}
	
	
}


class Ball implements Movable
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ball is moving with a Speed :"+speed);
	}
	
	
}

