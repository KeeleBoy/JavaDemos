package gcdemos;

/**
 * @author Kyle Warchuck
 * 
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// scanner
		Scanner scnr = new Scanner(System.in);

		// setting up an array
		String[] countries = new String[4];
		countries[0] = "China";
		countries[1] = "India";
		countries[2] = "United States of America";
		countries[3] = "Indonesia";

		// call a single array variable
		System.out.println("Most pop: " + countries[0]);

		// change one of the array variables
		countries[2] = "United States";

		// print whole array of strings
		System.out.println(Arrays.toString(countries));

		// how to loop through a list of an array
		// for loop is counting loops so its good for an array
		// if you have an array of 10 items last index is 9
		// Array of 5 last index is 4
		// counting starts at 0
		// .length gives length of an array
		for (int i = 0; i < countries.length; i++) {
			System.out.println(i);
			// how to print the variable at each index
			System.out.println(countries[i]);
		}
		// backwards counting through an array
		for (int i = countries.length - 1; i >= 0; i--) {
			// System.out.println(i);
		}

		// enhanced for loop
		// only lets you loop through arrays from top to bottom
		// unless you use a break to stop somewhere
		// make arrays plural
		// same as loop above but takes less typing
		for (String country : countries) {
			System.out.println(country);
		}

		// Using user input to grab from an array
		System.out.println("Pick and index: ");
		int userIndexChoice = scnr.nextInt();
		System.out.println(countries[userIndexChoice - 1]);

		// new array of integers
		int[] nums = { 1, 5, 7, 0 };

		// print each number in the array above
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

			// print the array above
			System.out.println(Arrays.toString(nums));
		}
		// another example of an enhanced for loop
		for (int num : nums) {
			System.out.println(num);

		}
		// 2d array
		// array of arrays
		int[][] someArray = new int[3][4];
		someArray[2][1] = 42;

		// initialize a 2d array in one line
		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// print 2d arrays
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		// nested for loops
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.println(cell + " ");
			}
		}

	}

}
