package com.hashmap;

public class Employee 
{

	int id;
	String name;
	
	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		 
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
