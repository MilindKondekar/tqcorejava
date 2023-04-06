package com.arraylistlogical;

import java.util.ArrayList;

public class Sort {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(7);
		al.add(5);
		al.add(9);
		al.add(7);
		
		sort(al);
	}

	private static void sort(ArrayList<Integer> al)
	{
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		
		System.out.println(al);
		
	}
}
