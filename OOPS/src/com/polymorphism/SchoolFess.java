package com.polymorphism;

public class SchoolFess 
{

	private String studentName;
	private float fees;
	private String schoolarShipId;
	
	
	public SchoolFess()
	{
	   this.fees =50000;
	}
	
	

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public float getFees() {
		return fees;
	}


	public String getSchoolarShipId() {
		return schoolarShipId;
	}


	public void setSchoolarShipId(String schoolarShipId) {
		this.schoolarShipId = schoolarShipId;
	}
	
	public void fees(String name)
	{
		studentName =name;
	}
	
	public void fees(String name, String id)
	{
		studentName =name;
		schoolarShipId =id;
		this.fees =(float) (fees-(0.2*fees));
		
	}
}
