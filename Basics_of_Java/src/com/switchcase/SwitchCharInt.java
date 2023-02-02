package com.switchcase;

import java.util.Scanner;

public class SwitchCharInt {

	public static void main(String[] args) {

     char ch='Z';
     
     switch(ch)
     {
     case 65: System.out.println("Capital A");
               break;
     case 90: System.out.println("Capital Z");
               break;         
     }
      
     int i= 90; //> can write byte and short
     
     switch(i)
     {
     case 'A': System.out.println("Capital A");
                break;
     case 'Z':System.out.println("Capital Z");
              break;
     }
    
     int val=48;
     
     char ch1 =(char) val;
     System.out.println(ch1);
     

	}

}
