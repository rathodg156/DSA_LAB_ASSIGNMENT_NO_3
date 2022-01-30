package com.greatlearning.services;

import java.util.Stack;

public class BalancingBrackets {

	//part-1
	//static function
	//args-- bracketExpression...({[]})
		//boolean
	public static boolean checkingBracketBalanced(String bracketExpression) {
		
		//Initialized the stack data structure
	 Stack<Character> stack = new Stack<Character>();
	//across each of character in the bracketExpression
			for (int i=0 ; i<bracketExpression.length();i++) 
			{
				//fetch each character
				char character = bracketExpression.charAt(i);
				//check if character is opening bracket
				//push
		  if (character == '(' || character == '[' || character=='{') 
		  {
			  stack.push(character);
		  continue;
		  }
		  //else {
		  // check If Stack is empty--- ask why ??
		  // pop from stack
	      //switch case on character
		  //different cases for closing bracket
		  //check popped element is corresponding brackets for the case
		  //finally return stack.isEmpty()
		  
		  if(stack.isEmpty())
			  return false;
		   
		  char c=stack.pop();
		  
		   switch (character) {
		   case '}':
			   if(c!='{')
				   return false;
			     break;
			   
		   case ')':
			   if(c!='(')
				   return false;
			     break;
		   case ']':
			   if(c!='[')
				   return false;
			     break;
			 default: return false;
		   }
	   }
		return (stack.isEmpty());
    }
}              
		
