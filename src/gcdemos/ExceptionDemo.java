package gcdemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Kyle Warchuck
 *
 */

public class ExceptionDemo {

	public static void main(String[] args) {

		String dateString = "01/28/2021";

		try {
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
		} catch (ParseException e) {

			e.printStackTrace();
			System.out.println("Invalid date...");
		}

		System.out.println("Goodbye!");

		try {
			String numberInAString = "abc";

			int number = Integer.parseInt(numberInAString);

			int answer = 10 / number;

		} catch (NumberFormatException nfe) {
			System.out.println("Thats not a number");
		} catch (ArithmeticException ae) {
			System.out.println("Can not divide by 0");
		} catch (Exception e) {
			System.out.println("Something went wrong...");
			e.printStackTrace();

		}

	}

}
