package com.inheritance;

public class DynamicMethodDispatch 
{
   
	public static void main(String[] args) 
	{
	  Player p = new HockeyPlayer();
	  p.Display();
	  p = new CricketPlayer();
	  p.Display();
	}
	
}


class Player
{
	void Display()
	{
		System.out.println("I am a player");
	}	
}

class HockeyPlayer extends Player
{
	void Display()
	{
		System.out.println("I am a HockeyPlayer");
	}	
}


class CricketPlayer extends Player
{
	void Display()
	{
		System.out.println("I am a CricketPlayer");
	}	
}