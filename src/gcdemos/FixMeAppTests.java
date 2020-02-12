package gcdemos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FixMeAppTests {

	@Test
	void testSum() {
		int[] string1 = new int[2];
		string1[0] = 2;
		string1[1] = 1;

		int actual = FixMeApp.findSum(string1);

		assertEquals(3, actual);
	}

	@Test
	void testCountMatches() {
		List<String> list1 = new ArrayList<>();
		list1.add("banana");
		list1.add("apple");
		list1.add("banana");

		int actual = FixMeApp.countMatches(list1, "banana");
		int expected = 2;

		assertEquals(expected, actual);

	}

	@Test
	void repeatTest() {
		String string1 = "hello";

		String actual = FixMeApp.repeat(string1, 2);
		String expected = ("hellohello");

		assertEquals(expected, actual);

	}

	@Test
	void reverse() {
		String string2 = "hello";

		String actual = FixMeApp.reverse(string2);
		String expected = ("olleh");

		assertEquals(expected, actual);

	}
}
