package com.containment;

public class Book 
{

	private int id;
	private String bookName;
	private int price;
	private Author author;
	
	Book()
	{
		
	}

	public Book(int id, String bookName, int price, Author author)
	{
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public Author getAuthor() 
	{
		return author;
	}

	public void setAuthor(Author author) 
	{
		this.author = author;
	}

	
	public String toString() 
	{
		return "Bookid=" + id + ", bookName=" + bookName + ", price=" + price + ", author=" + author ;
	}


	
	
}
