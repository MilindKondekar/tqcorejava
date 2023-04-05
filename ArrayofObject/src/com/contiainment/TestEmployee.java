package com.contiainment;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dept[] = new Department[3];
		
		dept[0] = new Department(1,"Sales");
		dept[1] = new Department(2,"Income Tax");
		dept[2] = new Department(3,"Marketing");
		
		Employee emp[] = new Employee[7];
		
		emp[0] = new Employee(101,"Milind",25000,dept[0]);
		emp[1] = new Employee(102,"Ram",30000,dept[1]);
		emp[2] = new Employee(103,"Shyam",40000,dept[2]);
		emp[3] = new Employee(105,"Rushi",50000,dept[0]);
		emp[4] = new Employee(106,"Ganesh",35000,dept[1]);
		emp[5] = new Employee(107,"Akash",55000,dept[2]);
		emp[6] = new Employee(108,"Vinayak",50000,dept[1]);
		
		//departmentwiseCount(emp,dept);
		//highestSalary(emp);
		sort(emp);
		
	}
	
	
	public static void departmentwiseCount(Employee e[],Department dept[])
	{
		
		for(Department d: dept)
		{
			int count = 0;
			for(Employee emp:e)
			{
				if(emp.getDepartment().equals(d.getName()))
				{
					count++;
				}
							
			}
			System.out.println("Department Name :"+d.getName()+" No Of Employees :"+count);
			System.out.println("=====================================");
			
		}
		
			
	}
	
	
	public static void highestSalary(Employee e[])
	{
		
		float highest  =Float.MIN_VALUE;
		for(Employee emp:e)
		{
			if(emp.getSalary()>highest)
			{
				highest = emp.getSalary();
			}
					
		}
		
		for(Employee emp:e)
		{
			if(emp.getSalary()==highest)
			{
				System.out.println("Employee Name :"+emp.getName()
				                   +"\nEmployee ID :"+emp.getId()
				                   +"\nEmployee Salary :"+emp.getSalary()
				                   +"\nDepartment :"+emp.getDepartment());
				System.out.println("====================================");
			}
			
		}
		
	}
	
	
	public static void sort(Employee e[])
	{
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].getSalary()>e[j].getSalary())
				{
					Employee temp;
					temp = e[i];
					e[i]= e[j];
					e[j] = temp;
				}
			}
		}
		
		for(Employee emp:e)
		{

			System.out.println("Employee Name :"+emp.getName()
			                   +"\nEmployee ID :"+emp.getId()
			                   +"\nEmployee Salary :"+emp.getSalary()
			                   +"\nDepartment :"+emp.getDepartment());
			System.out.println("====================================");
		}
		
	}
	

}
