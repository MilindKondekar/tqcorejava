package com.practise;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(1,"Rushi",70));
		al.add(new Student(7,"Shreyas",90));
		al.add(new Student(2,"Vinayak",80));
		al.add(new Student(3,"Akash",90));
		al.add(new Student(3,"Onkar",90));
		al.add(new Student(3,"Abhi",90));
		
       Collections.sort(al);
      
       for(Student s:al)
       {
    	   System.out.println(s);
       }
		
	}

}
