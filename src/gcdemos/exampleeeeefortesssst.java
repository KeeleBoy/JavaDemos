package gcdemos;

public class exampleeeeefortesssst {

	public static void main(String[] args) {

		double price = 3.5;
		int quantity = 2;

		double cost = CalcCost(price, quantity);
		System.out.println(cost);
		System.out.println(getGreeting());

	}

	public static double CalcCost(double price, int quantity) {
		double cost = price * quantity;
		return cost;
	}

	public static String getGreeting() {
		String greeting = "Hello world";
		return greeting;

		
	}
}
