package gcdemos;

import java.util.Arrays;

public class ArraysChallange {

	public static void main(String[] args) {
		// #1 Sum the values in this array. Answer: 54
		int[] numbers = { 1, 1, 2, 3, 5, 8, 13, 21 };
		int total = 0;
		for(int i = 0; i < numbers.length; i++) {
			total += (numbers[i]);
		}
		System.out.println(total);
		int[][] matrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		int sum = 0;
		for (int[] row : matrix) {
			for (int i = 0;i < row.length;i++) {
				//System.out.println(row[i]);
				sum += (row[i]);
				System.out.println(sum);
			}
		}
			
	}

}
