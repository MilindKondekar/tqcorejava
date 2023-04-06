package com.encapsulation;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Book b1 = new Book();
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Book Name");
		b1.setBookName(sc.next());
		System.out.println("Enter ID");
		b1.setBookId(sc.nextInt());
		System.out.println("Enter author");
		b1.setAuthor(sc.next());
		System.out.println("Enter price");
		b1.setPrice(sc.nextFloat());
	   
		
		System.out.println("--------------Book Details------------");
		/*System.out.println(" Book Name :"+b1.getBookName()
		                  +"\n Book ID :"+b1.getBookId()
		                  +"\n Author ID :"+b1.getAuthor()
		                  +"\n Price :"+b1.getPrice());*/
		
		System.out.println(b1);
	}

}
