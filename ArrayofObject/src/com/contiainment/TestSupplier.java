package com.contiainment;

public class TestSupplier {

	public static void main(String[] args) 
	{
		Supplier s[] = new Supplier[3];
		Item i1[] = new Item[3];
		
	  i1[0] = new Item(1,"Apple",80,2);
	  i1[1] = new Item(2,"Gauava",78,3);
	  i1[2]  = new Item(3,"Oranges",25,4);
	  
	  s[0] = new Supplier(101,"Mr.Pratik","123456",i1);
	  
	  Item i2[] = new Item[2];
		
	  i2[0] = new Item(1,"PineApple",80,2);
	  i2[1] = new Item(2,"Apples",78,3);
	 
	  s[1] = new Supplier(102,"Mr.Milind","123456",i2);
	  
	  Item i3[] = new Item[2];
		
	  i3[0] = new Item(1,"Mango",80,2);
	  i3[1] = new Item(2,"Banana",78,3);
	  
	  
	  
	  for(Supplier st:s)
	  {
		  System.out.println(st.getSid()+" "+st.getSname()+" ");
	  }
	  

	}

}
