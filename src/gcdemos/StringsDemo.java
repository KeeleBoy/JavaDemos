package gcdemos;

import java.util.Arrays;

/*
 * @ Author Kyle Warchuck
 */

public class StringsDemo {

	public static void main(String[] args) {
		
		//initial string
		String phrase = "Java is a meme";
		
		//charAt() returns a character
		char a = phrase.charAt(3);
		System.out.println(a);
		System.out.println();
		
		
		boolean b = phrase.endsWith("me");
		System.out.println(b);
		
		int i = phrase.indexOf("a");
		System.out.println(i);
		
		int j = phrase.lastIndexOf("a");
		System.out.println(j);
		
		System.out.println(phrase.length());
		
		System.out.println(phrase.replace('i', 'a'));
		
		//String[] arr = {"apple", "bob", "charlie"};
		//String[] arr2 = new String[1];
		
		//array of strings
		
		//System.out.println(Arrays.toString(arr);
		
		//for each loop also referred to as an enhanced or advanced for loop
		String[] arr = phrase.split(" ");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		//word.substring(
		System.out.println(phrase.substring(10));
		
		System.out.println(phrase.toLowerCase());
		//toUpperCase
		
		//sub strings are strings
		
		//easy
		
		
		
		
		
		
		

	}

}
