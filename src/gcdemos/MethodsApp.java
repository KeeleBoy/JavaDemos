package gcdemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsApp {

	public static void main(String[] args) {
		// 1. Call sayHello
		sayHello();
		
		// 2. Call introduceYourself
		introduceYourself("Sean", 25);
		
		// 3. Call getDay, print the result
		getDay();
		System.out.println(getDay());
		
		// 4. Call getAverage, print the result
		System.out.println(getAverage(5, 3));
		
		// 5. Call square, pass it x, store the result in a variable called x2, print x2
		int x = 3;
		int x2 = square(x);
		System.out.println((x2));
		
		// 6. Call square twice... with a and b. Add the results together and print it.
		int a = 4, b = 3;
		int a2 = square(a);
		int b2 = square(b);
		int ab = (a2 + b2);
		System.out.println(ab);
		//OR you could do this in one line
		//System.out.println(square(a) + square(b));
		
		
		// 7. Find the hypoteneus: square root of (a squared + b squared).
		// Store the result in a variable and then print it.
		int hypotenuse = squareRoot(square(a) + square(b));
		
		// 8. Call isJavaCool from OtherMethods and print the result
		boolean results = OtherMethods.isJavaCool();
		System.out.println(results);
		// OR in 1 line 
		//System.out.println(OtherMethods.isJavaCool());
		
		// 9. In the loop, call isVowel from OtherMethods. Pass it letter.
		// Store the result in a variable.
		// Then print out letter and the variable in one line.
		String word = "Java";
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			boolean boolIsVowel = OtherMethods.isVowel(letter);
			System.out.println(letter + " " + boolIsVowel);
		}
		
		// 10. Call getRandomLetter from OtherMethods. Store it in a variable and print it.
		// Call isVowel using the random letter. print the result.
		char rand = OtherMethods.getRandomLetter();
		System.out.println(rand);
		System.out.println(OtherMethods.isVowel(rand));
		
		// 11. Call square, passing it z. Add the result to z. Print z.
		int z = 7;
		z += square(z);
		System.out.println(z);
		
	}
	
	private static void sayHello() {
		System.out.println("Hello");
	}
	
	private static void introduceYourself(String name, int age) {
		System.out.println("I'm " + name + ". I'm " + age + " years old.");
	}
	
	private static String getDay() {
		return new SimpleDateFormat("EEEE").format(new Date());
	}
	
	private static double getAverage(int a, int b) {
		return (a + b) / 2.0;
	}
	
	private static int square(int n) {
		return n * n;
	}
	
	private static int squareRoot(int n) {
		return (int) Math.round(Math.sqrt(n));
	}
}
