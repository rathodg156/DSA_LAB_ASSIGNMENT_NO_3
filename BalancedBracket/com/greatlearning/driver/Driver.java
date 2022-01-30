package com.greatlearning.driver;
import com.greatlearning.services.BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		String bracketExpression = "([[{}]])";
		for(Character ch :bracketExpression.toCharArray()) {
			System.out.println(ch);
		}
		Boolean result;
		result = BalancingBrackets.checkingBracketBalanced(bracketExpression);
		
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else 
			System.out.println("The entered String do not contaion Balanced Brackets");	
	}

}
