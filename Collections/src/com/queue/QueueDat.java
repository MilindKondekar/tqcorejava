package com.queue;

public class QueueDat 
{

	int r;
	int f;
	int [] arr;
	int size;
	
	QueueDat(int size)
	{
		f=0;
		r=0;
		this.size = size;
		arr = new int[size];
	}
	
	
	public void insert(int data)
	{
	    	
		if(r<size)
		{
			arr[r] = data;
			r++;
		}
		
		else
		{
			System.out.println("Overflow");
		}
	}
	
	
	public void delete()
	{
		if(r>f)
		{
			
		}
	}
	
	
	
}
