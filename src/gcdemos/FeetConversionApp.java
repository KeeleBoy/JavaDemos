package gcdemos;

import java.util.Scanner;

//to do
//ask user for feet
//get response
//do conversion
//print result

public class FeetConversionApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);		
		
		System.out.println("What is your input in feet?");
		
		int feet = scnr.nextInt();
		
		int inches = feet * 12;
		
		System.out.println("Your input in feet converted to inches is " + inches + " inches");
		
		

	}

}
