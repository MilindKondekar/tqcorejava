package com.enums;

public class EnumDemo 
{

	public enum WeekDays{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};	
	
	public static void main(String[] args) 
	{
		
		WeekDays w = WeekDays.SUNDAY;
		
	for(WeekDays w1: WeekDays.values())
	{
		System.out.println(w1);
	}
		
	}
	
}
