package gcdemos;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// System.out.println(Person.getTears(1));

		// Person.greeting();

		Person person1 = new Person();

		Person person2 = new Person("Garth", 62);

		Person person3 = new Person("john", 59, 13);

//		String name = person3.getName();

		person1.toString();

		// System.out.println(person2);

		// create an instance of the scanner class
		Scanner scnr = new Scanner(System.in);

//		System.out.println("Enter your name: ");
//		String name = scnr.nextLine();

//		System.out.println("Enter your age: ");
		int age = Validator.getInt(scnr, "Enter your age: ", 0, 121);

		Person me = new Person();

		me.setName(Validator.getString(scnr, "Enter your name: "));
		me.setAge(age);

		System.out.println(me);
		
//		public static arrayList getNameTags(Scanner,ArrayList<Person>,int) {
		
//		System.out.println("Please enter how many users you would like to add to the list: ");
		
//			int choice = scnr.nextInt();
			
			
			
		}
		
		/*
		 * Write a method named getNameTags
		 * 
		 * that takes in 3 parameters
		 * 
		 * Scanner, ArrayList<Person>,
		 * 
		 * and an int for the number of people (at least 3)
		 * 
		 * Allow a user to enter in the amount of people they'd like to add to an
		 * ArrayList
		 * 
		 * Show the name tags for each user getNameTag()
		 * 
		 * 
		 * 
		 */
		

//	}

}
