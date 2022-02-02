package practiceproblems;

import java.util.Scanner;

public class TestDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int value = sc.nextInt();
		do {
			System.out.println("Enter a number: ");
			value = sc.nextInt();
		}
		while(value !=5);
		
		System.out.println("Got 5!");

	}

}
