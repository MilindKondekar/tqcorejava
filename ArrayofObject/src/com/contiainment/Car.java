package com.contiainment;

import java.util.Arrays;

public class Car 
{

	private int carId;
	private String brand;
	private Driver []driver;
	
	
	public Car()
	{
		
	}
	
	public Car(int carId,String brand,Driver []driver)
	{
		this.carId = carId;
		this.brand = brand;
		this.driver = driver;
	}
	
	public int getCarId()
	{
		return carId;
	}
	
	public void setCarID(int carId)
	{
		this.carId = carId;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	
	public Driver [] getDriver()
	{
		return driver;
	}
	
	public void setDriver(Driver [] driver)
	{
		this.driver=driver;
	}

	
	public String toString() 
	{
		return "Car carId=" + carId + ", brand=" + brand + ", driver=" + Arrays.toString(driver) ;
	}
	
	
}
