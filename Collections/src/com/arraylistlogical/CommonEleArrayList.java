package com.arraylistlogical;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonEleArrayList 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String>  al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Dotnet");
		al1.add("C");
		
		ArrayList<String>  al2 = new ArrayList<>();
		al2.add("Angular");
		al2.add("Python");
		al2.add("Dotnet");
		al2.add("C++");
		
		commonEle(al1,al2);
		
	}

	private static void commonEle(ArrayList<String> al1, ArrayList<String> al2) 
	{
		
		for(int i=0;i<al1.size();i++)
		{
			
			if(al1.get(i).equals(al2.get(i)))
			{
				System.out.println(al1.get(i));
			}
		}
		
	}
}
