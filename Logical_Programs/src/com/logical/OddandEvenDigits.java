package com.logical;

import java.util.Scanner;

public class OddandEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc  = new Scanner(System.in);
		
		int num = sc.nextInt();
		int even =0;
		int odd= 0;
		
		for(int i=0;i<=num;i++ )
		{
			if(i%2==0)
			{
				even++;
			}
			
			else
			{
				odd++;
			}
		}
		System.out.println();
	}
	
	
}
