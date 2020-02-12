package Animals;

public class Spider extends Animals {

	public Spider(int legs) {
		super(8);
	}

	@Override
	public void sleepType() {
		System.out.println("Sleeps backwards");

	}

	@Override
	public void eat() {
		System.out.println("Eats human flesh");

	}

}
