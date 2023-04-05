package com.contiainment;

import java.util.Arrays;
import java.util.Scanner;

public class TestBook {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1[] = new Book[2];
		for(int i=0;i<2;i++)
		{
			b1[i] = new Book();
			enterdetails(b1[i]);
		}
		
		showdetails(b1);
	}
    
	 public static void enterdetails(Book b1)
	 {
		 System.out.println("Enter Book ID");
		 b1.setId(sc.nextInt());
		 
		 System.out.println("Enter Book Name");
         b1.setName(sc.next());
         
         System.out.println("Enter Book price");
         
         b1.setPrice(sc.nextInt());
         
         b1.setAuthor(new Author());
         
         System.out.println("Enter Author Id");
         b1.getAuthor().setAuthorId(sc.nextInt());
         
         System.out.println("Enter Author Name");
         b1.getAuthor().setAuthorName(sc.next());
         
		 		 
	 }
	
	public static void showdetails(Book b1[])
	{
		for(Book b:b1)
		{
			System.out.println(b);
		}
		
	}
}
