package com.custom;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] arr = new float[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of three subjects");
		
		for(int i=0;i<arr.length;i++)
		{
			float x = sc.nextInt();
			if(x<0||x>100)
			{
				throw new StuNameException("Invalid marks");
			}
			else
			{
				arr[i] = x;
			}
		}
		
		Student s1 = new Student(1,"Ram",arr);
		System.out.println(s1);
	}

}
