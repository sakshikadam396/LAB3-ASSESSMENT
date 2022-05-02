package com.greatlearning.bracketbalance;

import java.util.Stack;

public class Bracketbalancing {

	Stack<Character> stack = new Stack<Character>();
	
	public Boolean checkbalancedBracket(String strl) {
		
		
		for (char x : strl.toCharArray()) {
			 
			if (x =='('|| x == '['|| x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;	
			}
            char check;
            switch (x) {
            case ')':
            	check = stack.pop();
            	if (check == '{' || check == '[')
            		return false;
            	break;
            case'}' :	
            	check = stack.pop();
            	if (check == '(' || check =='[')
            		return false;
            	break;
            case ']' :
            	check = stack.pop();
            	if (check == '('|| check =='}')
            	break;
            } 
		}
		return (stack.isEmpty());
	}
			

}
