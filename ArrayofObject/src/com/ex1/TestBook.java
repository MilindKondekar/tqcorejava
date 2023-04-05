package com.ex1;

import java.util.Scanner;

public class TestBook {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1[] = new Book[4];
		for(int i=0;i<4;i++)
		{
			b1[i] = new Book();
			enterdetails(b1[i]);
		}
		
	}
    
	 public static void enterdetails(Book b1)
	 {
		 System.out.println("Enter Book ID");
		 b1.setId(sc.nextInt());
		 
		 System.out.println("Enter Book Name");
         b1.setName(sc.next());
         
         System.out.println("Enter Book price");
         
         b1.setPrice(sc.nextInt());
		 		 
	 }
	
	public static void showdetails(Book b1)
	{
		
	}
}
