package gcdemos;

public class EnumDemo {

	public static void main(String[] args) {

		Signal woodward = Signal.GREEN;
		woodward = Signal.RED;

		if (woodward == Signal.YELLOW) {
			System.out.println("Speed up!");

		} else if (woodward != Signal.RED) {
			System.out.println("Slow down and watch out.");
		} else {
			System.out.println("Floor it!");
		}

		TicketType ticket = TicketType.ADULT;

		System.out.printf("%.2f", ticket.getPrice());

	}
}