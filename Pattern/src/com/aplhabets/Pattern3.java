package com.aplhabets;

public class Pattern3 {
	
	
public static void main(String[] args) 
{

	for(char i='G';i>='B';i--)
	{
		for(char j='G';j>=i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}

}