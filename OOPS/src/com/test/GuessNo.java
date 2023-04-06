package com.test;

import java.util.Scanner;

public class GuessNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Enter country name");
          Scanner sc = new Scanner(System.in);
      String x =sc.next();
      
      switch(x)
      { 
      case "India" : System.out.println("Pincode -0231");
      break;
      case "America" : System.out.println("Pincode -0233");
      default : System.out.println("wrong input");
      } 
	}

}
