package com.hashmap;

public class Author
{

  String name;

  
  public Author()
  {
	  
  }
  
  public Author(String name) 
  {
	
	this.name = name;
  }


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Author [name=" + name + "]";
}

 
  
  
	
	
}
