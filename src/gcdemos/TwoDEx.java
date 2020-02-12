package gcdemos;
import java.util.Arrays;

public class TwoDEx {

	public static void main(String[] args) {
		// [rows][columns]  a.k.a. [y][x];
		char[][] board = new char[3][3];
		
		board[1][1] = 'x'; // [y][x]
		board[0][0] = 'y';
		board[2][2] = 'x';
		board[2][0] = 'y';
		board[1][0] = 'x';
		board[1][2] = 'y';
		board[0][1] = 'x';
		board[2][1] = 'y';
		board[0][2] = 'x';
		
		
		print2D(board);
	}
	
	private static void print2D(char[][] array) {
		// loop through the rows. print each row.
		for (int y = 0; y < array.length; y++) {
			System.out.println(Arrays.toString(array[y]));
		}
	}

}
