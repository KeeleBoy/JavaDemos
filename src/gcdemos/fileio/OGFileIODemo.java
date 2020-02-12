package gcdemos.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OGFileIODemo {

	private static String filePath = "stuff.txt";

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Available commands:");
		System.out.println(" list");
		System.out.println(" add <line to add here>");
		System.out.println(" quit");

		while (true) {
			System.out.print("Enter a command: ");
			String command = scnr.nextLine();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("list")) {
				List<String> things = readFile();
				System.out.println(things);
			} else if (command.startsWith("add ")) {
				String thing = command.substring(4);
				appendLineToFile(thing);
			} else {
				System.out.println("Invalid command.");
			}
		}
		System.out.println("Goodbye.");
		scnr.close();
	}

	/**
	 * Read all the lines from a file and store them in a List of Strings.
	 */
	public static List<String> readFile() {
		// TODO: 1) catch exceptions. 2) close file.

		try {

			List<String> lines = new ArrayList<>();

			// buffered reader makes file reader more effective
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			// have to remember to close files
			// thats why reader has an information leak problem

			String line = reader.readLine();

			// while the file is not empty add line to file
			// whenever dealing with file i/o weird things can happen
			// disc gets disconnected weird input ect
			// have to add a try catch
			while (line != null) {
				lines.add(line);
				line = reader.readLine();
			}
			return lines;
//		} finally { reader.close();
		} catch (IOException e) {
			System.out.println("Unable to read file, sorry.");
			return new ArrayList<>();
		}
	}

	/**
	 * Add a line to the end of the file.
	 */
	public static void appendLineToFile(String line) {
		try {
			// A PrintWriter lets us easily write lines of characters to a destination.
			// FileWriter sets up a file as the destination. "true" means append.
			// "false" erase and rewrite the file.
			PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
			try {
				writer.println(line);
			} finally {
				// Always close a file that you open.
				// finally makes sure this happens whether or not there is an exception.
				writer.close();
			}
		} catch (IOException e) {
			// Many of the operations above could cause an IOException.
			System.out.println("Error. Unable to write to file.");
		}
	}

}
