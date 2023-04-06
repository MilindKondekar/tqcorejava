package com.sort;

public class Student 
{

	int id;
	String name;
	float marks;
	Course course;
	
	public Student(int id, String name, float marks, Course course)
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	
	
	
}
