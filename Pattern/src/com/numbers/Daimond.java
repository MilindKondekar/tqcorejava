package com.numbers;

public class Daimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
		
			for(int i=2;i<=4;i++)
			{
				int x=1;
				for(int k=1;k<i;k++)
				{
					System.out.print(" ");
				}
							
				
				for(int j=4;j>=i;j--)
				{
					System.out.print(x+" ");
					x++;
				}
				System.out.println();
			}
			
		}	
	}


