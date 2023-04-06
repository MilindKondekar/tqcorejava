package com.constructorchaining;

public class Demo {

	int a;
	int b;
	int c;
	
	Demo()
	{
		a=50;
		b=70;
		c=90;
	}
	
	
	Demo(int a)
	{
		this();
		this.a =a;
		
		
	}
	
	
	Demo(int a,int b)
	{
		this();
		this.a =a;
		this.b = b;
		
	}
	
	Demo(int a,int b, int c)
	{
		
		this.a =a;
		this.b = b;
		this.c = c;
	}
	
	public String toString()
	{
		return "a "+a+" b "+b+" c "+c;
	}
	
	public static void main(String[] args) 
	{
		
	   Demo d1 = new Demo(10,20,30);	
	   System.out.println(d1);
		
	}
	
}
