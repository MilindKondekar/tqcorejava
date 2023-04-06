package com.arraylistlogical;

import java.util.ArrayList;

public class FreqOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Java");
		al.add("Python");
		al.add("Java");
		
		freqOfEl(al);
	}

	
	public static void freqOfEl(ArrayList al)
	{
		int cnt ;
		
		for(int i=0;i<al.size();i++)
		{
			cnt = 1;
			if(al.get(i).equals("over"))
			{
				continue;
			}
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					cnt++;
					al.set(j, "over");
				}
			}
			
			if(cnt>1)
			{
				System.out.println(al.get(i)+":"+cnt);
			}
		}
		
		
	}
	
}
