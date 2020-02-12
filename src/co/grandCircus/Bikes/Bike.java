package co.grandCircus.Bikes;

public class Bike {

	// right click go to source and generate getters and setters is there

	protected String colour;
	protected int speed = 0;

	public Bike() {
		this.colour = "Black";

	}

	// right click source generate constructor using fields
	public Bike(String colour) {
		super();
		this.colour = colour;
	}

	// right click go to source generate to string

	public void go() {
		speed++;

	}

	public void setSpeed(int speed) throws IllegalArgumentException {
		if (speed < 0) {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", speed=" + speed + "]";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

}
