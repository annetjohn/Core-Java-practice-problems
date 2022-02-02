package practiceproblems;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// calculator problem- simple basic getting there. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers to be added: ");
		double first = sc.nextInt();
		double second = sc.nextInt();
		
		System.out.println("Enter an opertor: (+, -, *, / ): ");
		char operator = sc.next().charAt(0);
		
		//charAt(0) - returns a single character, the first character in a string has the index position. 
		double result; 
		
		switch(operator) {
		
		case '+':
			result = first + second;
			break;	
		case '-':
			result = first - second;
			break;	
		case '*':
			result = first * second;
			break;	
		case '/':
			result = first / second;
			break;	
			
			// now if the operator entered does not match we use default.
			default:
				System.out.println("Error! Operator is not correct");
				return;
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
		
		

	}

}
