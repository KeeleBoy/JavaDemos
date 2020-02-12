package gcdemos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindroneDemoTests {

	@Test
	void mumIsPalundrone() {
		boolean actual = PalindroneDemo.isPalindrone("mum");
		assertTrue(actual);
	}

	@Test
	void noIsNotPalundrone() {
		boolean actual = PalindroneDemo.isPalindrone("no");
		assertFalse(actual);
	}

	@Test
	void racecarIsPalundrone() {
		boolean actual = PalindroneDemo.isPalindrone("racecar");
		assertTrue(actual);
	}

	@Test
	void whitespaceIsPalundrone() {
		boolean actual = PalindroneDemo.isPalindrone("race car");
		assertTrue(actual);
	}

	@Test
	void titleCaseIsPalundrone() {
		boolean actual = PalindroneDemo.isPalindrone("Mum");
		assertTrue(actual);
	}

}
