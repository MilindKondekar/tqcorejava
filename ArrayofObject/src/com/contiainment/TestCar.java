package com.contiainment;

import java.util.Scanner;

public class TestCar {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Car c [] = new Car[1];
		for(int i=0;i<c.length;i++)
		{

			c[i] = new Car();
			enterDetails(c[i]);                    
		}
		
		
		for(Car c1:c)
		{
			System.out.println("Car Brand "+c1.getBrand()
			                   +"\nCar Id :"+c1.getCarId());
			for(Driver d:c1.getDriver())
			{
				System.out.println(d);
			}
			                   
		}

	}


	public static void enterDetails(Car c)
	{
		System.out.println("Enter car id");
		c.setCarID(sc.nextInt());

		System.out.println("Enter Brand Name");
		c.setBrand(sc.next());

		System.out.println("Enter Driver Numbers");
		int n =sc.nextInt();
		c.setDriver(new Driver[n]);

		for(int i=0;i<n;i++)
		{
			c.getDriver()[i] = new Driver();
			System.out.println("Enter Driver Id");
			c.getDriver()[i].setId(sc.nextInt());

			System.out.println("Enter Driver Name");
			c.getDriver()[i].setName(sc.next());

		}



	}


}
