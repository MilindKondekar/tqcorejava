package com.objectpassing;

public class TestStudent {

	
	public void setmarks(Student s)
	{
		if(s.getMarks()<50)
		{
			float marks =s.getMarks()+50;
			s.setMarks(marks);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 =new Student();
		s1.setAge(20);
		s1.setId(1);
		s1.setMarks(40);
		s1.setName("Milind");
		
		System.out.println("Before calling Method");
		System.out.println(s1.getName()+" "+s1.getMarks());
		
		TestStudent t = new TestStudent();
		t.setmarks(s1);
		
		System.out.println("After calling Method");
		System.out.println(s1.getName()+" "+s1.getMarks());
	}

}
