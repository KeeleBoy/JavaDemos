package gcdemos;

public class PalindroneDemo {

	public static void main(String[] args) {

	}

	public static boolean isPalindrone(String a) {

		a = a.replaceAll("\\s", "");
		// //s means white space so tabes or spaces or anything like that
		// if we just wanted to ignore spaces we would put a space rather than \\s

		String a1 = "";
		boolean isTrue = false;

		for (int i = a.length() - 1; i >= 0; i--) {
			a1 += a.charAt(i);

		}
		if (a.equalsIgnoreCase(a1)) {

			isTrue = true;
		} else {
			isTrue = false;

		}
		return isTrue;
	}

}
