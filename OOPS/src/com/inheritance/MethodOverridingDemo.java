package com.inheritance;

public class MethodOverridingDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Person p = new Person();
	   Employee e = new Employee();
	   Celebrity c = new Celebrity();
	}

}


 class Person
{
	
	void Display()
	{
		System.out.println("I am Person");
	}
}
 
 
 class Employee extends Person
 {
 	
 	void Display()
 	{
 		System.out.println("I am an employee");
 	}
 }
 
 class Celebrity extends Person
 {
 	
 	void Display()
 	{
 		System.out.println("I am an celebretiy");
 	}
 }
 
 
 
 