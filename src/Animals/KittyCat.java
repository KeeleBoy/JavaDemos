package Animals;

public class KittyCat extends Animals implements Pet {

	// have to initialize stuff here to build a constructor
	// protected String name;

	public KittyCat(String name) {
		this.name = name;
		// super();

	}

	public KittyCat() {
		this("");
	}

	public KittyCat(String name, int legs) {
		super("KittyCatt", 4);

	}

	@Override
	public void sleepType() {
		System.out.println("Sleeps on back");

	}

	@Override
	public void eat() {
		System.out.println("Eats fish");

	}

	@Override
	public String setName(String a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void play() {
		System.out.println("PLays...");
	}

}
