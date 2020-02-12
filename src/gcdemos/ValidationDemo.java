package gcdemos;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// checkForInt(scnr);
//		getInt(scnr, "Enter a whole number: ");
//		System.out.println("Please enter your name");
//		String name = scnr.nextLine;
//		System.out.println("Thanks");
//		System.out.println("Thanks alot" + respose);
		
		
		
		//Calling getInt from the validator class               min max
		//int num = Validator.getInt(scnr, "Enter a number: ", 0, 5);
		
		
		
		
		System.out.println("You entered: " + num);
		System.out.println("Thanks a lot.");

	}

	public static void checkForInt(Scanner scan) {

		System.out.println("Please enter a number: ");

		if (scan.hasNextInt()) {

			// hasNextInt returns a boolean value
			// if the next token is of type integer

			int num = scan.nextInt();
			System.out.println(num);
		} else {
			System.out.println("Please enter a WHOLE number: ");
		}
	}

	public static void getInt(Scanner scan, String prompt) {

		System.out.println(prompt);

		while (!scan.hasNextInt()) {
			// garbage line to clear out the scanner
			scan.nextLine();

			System.out.print("Sorry, I can't read that. ");
			System.out.println(prompt);

		}

		int num = scan.nextInt();
		
		//clear scanner again
		
		scan.hasNextLine();
		System.out.println("You entered: " + num);

	}

}
