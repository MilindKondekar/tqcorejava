package com.ifelse;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height in feet");
		float f = sc.nextFloat();
		System.out.println("Enter Weight in kg");
		float k =sc.nextFloat();
		float m = f * 0.3048f;
		
		float bmi = k/(m*m);
		
		System.out.println("BMI is "+bmi);
		
		if(bmi>18)
		{
			if(bmi<25)
				
			{
				System.out.println("You are healthy");
			}
			
			else
			{
				System.out.println("You are obese");
			}
		}
		
		else if(bmi<18)
		{
			System.out.println("You are underweight");
		}
		
		
		
		sc.close();
	}

}
