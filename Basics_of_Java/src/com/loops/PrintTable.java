package com.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("enter a number");
      int num= sc.nextInt();
      
      System.out.println("-------table---------------");
      
      
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(num+"X"+i+"="+(num*i));
      }

	}

}
