package com.containment;

import java.util.Scanner;

public class Library {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Book b1 = new Book();
		addDetails(b1);
		showDetails(b1);
	}

	
	public static void addDetails(Book b)
	{
		System.out.println("Enter Book ID");
		b.setId(sc.nextInt());
		System.out.println("Enter Book Name");
		b.setBookName(sc.next());
		System.out.println("Enter Book Price");
		b.setPrice(sc.nextInt());
		
		b.setAuthor(new Author());
		System.out.println("Enter Author ID");
		b.getAuthor().setId(sc.nextInt());
		System.out.println("Enter Author Name");
		b.getAuthor().setName(sc.next());
		
	}
	
	public static  void showDetails(Book b)
	{
		System.out.println("BookID "+b.getId()
				           +"\nBook Name :"+b.getBookName()
				           + "\nBook Price "+b.getPrice()
				           + "\nAuthor ID "+b.getAuthor().getId()
				           +"\nAuthor Name "+b.getAuthor().getName());
	}
	
	
}
