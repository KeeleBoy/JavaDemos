package gcdemos;import java.util.Scanner;
/* 
 * @authors jeannie jill kyle
 */
public class Exercise6 {	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean goAgain;//		do {
//			System.out.println("Hello World! \nWould you like to continue? (y/n)");
//			
//			goAgain = scnr.next().toLowerCase().startsWith("y");
//			
//		} while (goAgain);
//		
		goAgain = true;
		while (goAgain) {
			for (int i=0; i < 10; ++i) {
			System.out.print(i +" ");
			}
			System.out.println("Would you like to continue? (y/n)");
			goAgain = scnr.next().toLowerCase().startsWith("y");
		}		System.out.println("Goodbye.");
	}
}