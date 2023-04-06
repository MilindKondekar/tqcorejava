package com.sort;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.marks==o2.marks)
		{
			return 0;
		}
		else if(o1.marks>o2.marks)
		{
			return 1;
		}
		
		else
			{
			  return -1;
			}
	}

}
