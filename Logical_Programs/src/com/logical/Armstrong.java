package com.logical;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numerofDigits(123);
	}

	
	public static void numerofDigits(int num)
	{
		int cnt=0;
		int x=0;
		int a=1;
		while(num!=0)
		{
			x=num%10;	
			num=num/10;
			cnt++;
		}
		System.out.println("Number of Digits are "+cnt);	
		int j=1;
		int k=1;
		for(int i=1;i<=cnt;i++)
		{
			k=k*k;			
		}
		
	}
	
	
	
	
}
