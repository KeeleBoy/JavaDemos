package gcdemos;

import static org.junit.jupiter.api.Assertions.*;

//Static imports are important 

import org.junit.jupiter.api.Test;

class MathDemoTest {

	@Test
	void testAdd1and2() {
		int actual = MathDemo.add(1, 2);
		int expected = 3;
		assertEquals(expected, actual);

	}

	@Test
	void testAdd1and3() {
		int actual = MathDemo.add(1, 3);
		int expected = 4;
		assertEquals(expected, actual);

	}

}
