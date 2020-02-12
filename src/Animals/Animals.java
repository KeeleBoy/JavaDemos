package Animals;

public abstract class Animals {

	// if a class contains an abstract method then the
	// class has to be abstract
	// can have abstract class without abstract method

	protected String name;
	protected int legs;
	protected String sleep;

	public Animals(int legs) {
		this.legs = legs;

	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public Animals(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}

	public Animals() {
		this.legs = 4;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	@Override
	public String toString() {
		return "Animals [name=" + name + ", legs=" + legs + ", sleep=" + sleep + "]";
	}

	public abstract void sleepType();

	public void walk() {
		System.out.println("Walks on 4 legs");
	}

	public abstract void eat();

}
