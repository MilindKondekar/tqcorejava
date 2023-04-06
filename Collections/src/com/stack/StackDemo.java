package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		
		Stack<String> stk1 = new Stack<>();
		
		stk1.push("Red");
		stk1.push("Yellow");
		stk1.push("Violet");
		stk1.push("Blue");
		
	//	System.out.println(stk1);
		
		stk1.pop();
		
		//System.out.println(stk1);
		
		
		//System.out.println(stk1.peek());
		
       Enumeration<String> en = stk1.elements();
       
       while(en.hasMoreElements())
       {
    	   System.out.println(en.nextElement());
       }
		
	}

}
