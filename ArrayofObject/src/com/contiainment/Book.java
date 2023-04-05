package com.contiainment;

public class Book
{

	private int id;
	private String name;
	private int price;
	private Author author;
	
	
	Book()
	{
		
	}


	public Book(int id, String name, int price, Author author) 
	{
		
		this.id = id;
		this.name = name;
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


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
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
		return "id=" + id + ", name=" + name + ", price=" + price+" Author :"+author ;
	}
	
	
	
	
	
}
