package practiceproblems;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// getting user input between the range 1-100, print prime numbers less that the input no. Use if statements.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number between the range 1-100: ");
		
		int number = input.nextInt();
		System.out.println("the entered number is: " + number);
		
	}

}
