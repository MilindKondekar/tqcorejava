package com.interfaces;

public interface MessageService 
{

	public void Message();
	
	
}


class Wtsp implements MessageService
{

	@Override
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("Wtsp message : Hello");
	}
	
	
	
}


class Facebook implements MessageService
{

	@Override
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("Facebook message : Hi");
	}
	
	
	
}


