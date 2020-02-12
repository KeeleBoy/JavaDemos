package gcdemos;

import java.util.Scanner;

/*
 * 
 * 
 * @Author Kyle Warchuck
 * 
 * 
 * 
 * 
 */

public class ifElseApp {

	public static void main(String[] args) {
		
		//Shallow Grandmother 
		Scanner scnr = new Scanner(System.in);
		
		boolean acceptable = false;
		
		System.out.println("Enter your age: ");
		int age = scnr.nextInt();
		
		
		System.out.println("Enter your salary: ");
		int salary = scnr.nextInt();
		
		
		System.out.println("How cute are you 0.0-10.0? ");
		double cuteness = scnr.nextDouble();
		
		acceptable = (age >= 25 && age <= 40) && (salary >= 50000 || cuteness > 8.5);
		
		
		
		System.out.println("You are eligible to date my grandchild" + acceptable);
		
		
		//while (userInput == 'y'){
		
		//System.out.println("Enter your grade percentage: ");
		//int grade = scnr.nextInt();
		//This was my partners problem
		//}
		
		
		
		scnr.close();
		
		//must be age 25 less than 40
		//must earn min 50000 or cuteness > 8.5

	}

}
