package practiceproblems;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Machine started.");
			break;
		case "run":
			System.out.println("Machine is running.");
			break;
			
		}
		

	}

}
