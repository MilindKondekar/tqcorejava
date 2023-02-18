package com.operators;

public class AlternateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=10;
		int x=0;
		int y=0;

		for(int i=0;i<a;i++)
		{
			if(a%2==0)
			{
				if(i%2!=0)
				{
					System.out.println(i);
					x=x+i;
				}
			}
			
			else
			{
				if(i%2==0)
				{
					System.out.println(i);
					y=y+i;
				}
			}
		}
		
		if(x>0)
		{
			System.out.println("Sum of Alternate Number is "+x);
		}

		else
		{
			System.out.println("Sum of Alternate Number is "+y);
		}

	}

}
