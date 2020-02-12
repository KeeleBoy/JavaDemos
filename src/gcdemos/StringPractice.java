package gcdemos;

import java.util.Scanner;

/*
 * @Author Kyle Warchuck
 */

public class StringPractice {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = scnr.next();
		
		System.out.println("Enter your last name: ");
		String lastName = scnr.next();
		
		//convert users info to following format
		//knighting ceremoney ---- Sir ALLCAPSFIRST Firstletterlastnamecap
		
		
		System.out.print("Sir ");
		System.out.print(firstName.toUpperCase());
		System.out.print(" ");
		String letter1 = (lastName.substring(0, 1));
		letter1.toUpperCase();
		System.out.print(letter1);
		System.out.print(lastName.substring(1));
		

	}

}
