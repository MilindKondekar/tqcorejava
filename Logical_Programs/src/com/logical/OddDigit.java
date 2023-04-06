package com.logical;

import java.util.Scanner;

public class OddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int cnt =1;
		
		int rev =0;
		while(num!=0)
		{   
			int digit = num%10;
			rev = rev*10+digit;		
			num=num/10;
		}
		
		while(rev!=0)
		{
			int digit = rev%10;
			if(cnt%2!=0)
			{
				System.out.println(digit);
			}
			rev=rev/10;
			cnt++;
		}
		
		//System.out.println(rev);
	}

}
