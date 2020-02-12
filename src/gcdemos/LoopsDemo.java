package gcdemos;

import java.util.Scanner;

public class LoopsDemo {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	
	//for loop counts iterations
	
	for (int i = 1; i <= 6; i++) {
		System.out.println("Set plate.");
		System.out.println("Set fork.");
		System.out.println("Set spoon.");
		System.out.println("Set knife.");
	}
	
	//System exit kills program
	
	//count 0 to 5
	for (int i =0; i < 6; i++) {
		System.out.println(i);
	}
	
	
	
	System.exit(0);
	
	
	
	
	
	
	
	
	
	
	//while loop checks for condition before loop
	System.out.println("Want to play? y/n: ");
	boolean wantToPlay = scnr.next().startsWith("y");
	
	while (wantToPlay) {
		System.out.println("Play.");
		
		System.out.println("Want to play again? y/n: ");
		wantToPlay = scnr.next().startsWith("y");
	}
	
	
	
	
	
	
	
	
	
	//do loop always runs the loop first then checks condition 
	//iteration is word for 1 loop
	
	
	
	boolean foundIt;
	System.out.println("Google search");
	
	
	do {
		System.out.println("Open page");
		System.out.println("Did you find the quote? (y/n)");
		foundIt = scnr.next().startsWith("y");
		
		
	} while (!foundIt);
	
		System.out.println("Send to friend. Done.");
	
	

	}
}