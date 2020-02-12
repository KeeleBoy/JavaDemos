package gcdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("abc");
		boolean b = m.matches();

		boolean foo = Pattern.matches("[abc]+", "abc");

		String visaRegex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		String cardNumber = "444-3333-2222-1111";
		//true
		String variable = "goodVariableName123";
		String variable2 = "$goodVariableName123";
		
		//false
		String variable3 = "1badVariableName123";
		String variable4 = "badVariableName123";

		// call isValidIdentifier and return true for acceptable

		String idRegex = "";

		// isValidCreditCard(cardNumber,visaRegex);

		System.out.println(isValidCreditCard(cardNumber, visaRegex));

	}

	public static boolean isValidCreditCard(String card, String regex) {

		return Pattern.matches(regex, card);

	}

	public static boolean isValidIdentifier(String name, String regex) {

		return Pattern.matches([a-z {4}=A-Z {1}-a-z{7}-A-Z{1}-a-z{3}], name);

	}

}
