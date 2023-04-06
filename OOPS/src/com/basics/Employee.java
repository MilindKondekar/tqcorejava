package com.basics;

public class Employee {


	int id;
	String name;
	float exp;
	float salary;

	public void EnterDetails(int empid,String empname,float expereince,float sal)
	{

		id = empid;
		name = empname;
		exp = expereince;
		salary = sal;
	}

   public void DisplayDetails()
   {
	   System.out.println("Employee ID :"+id
			               +"/n EmployeeName :"+name
			               +"/n Employee Expereince :"+exp
			               +"/n Employee Salary :"+salary);
   }
   
   public void Increment()
   {
	   salary = (float) (salary+salary*0.2); 
	   System.out.println("After incrementing Salary is:"+salary);
   }
   
  
   
   
}
