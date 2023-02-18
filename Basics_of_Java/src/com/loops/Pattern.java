package com.loops;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int rows = 5;
		int x=1;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
		{ 
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			
			
			for (int k = 1; k <= i; k++)
			{
				System.out.print(x + " ");
			}
			System.out.println();
			x++;
		}



	}

}
