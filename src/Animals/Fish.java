package Animals;

public class Fish extends Animals {

	public Fish(int legs) {
		super(0);
	}

	@Override
	public void walk() {
		System.out.println("Fish have no legs");
	}

	@Override
	public void sleepType() {
		System.out.println("Sleeps on back");

	}

	@Override
	public void eat() {
		System.out.println("Eats garbage");

	}

}
