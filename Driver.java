package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.bracketbalance.Bracketbalancing;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System. out.println("Enter the string :");
       Scanner sc = new Scanner (System.in);
       String expr = sc.next();
       
       Bracketbalancing bb = new Bracketbalancing();
       if (bb.checkbalancedBracket(expr)) {
    	   System.out.println("The bracket are balanced");
      }
       else {
    	   System.out.println("The bracket are not balanced");
    	   sc.close();
       }
	}

}
