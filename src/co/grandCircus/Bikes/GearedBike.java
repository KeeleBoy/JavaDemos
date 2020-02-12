package co.grandCircus.Bikes;

public class GearedBike extends Bike {
	// this extends or inherits bike class
	// just adding the extends Bike to this class gives it go, speed and colour
	// doesn't extend constructors

	protected int gear = 1;

	public GearedBike() {
		super();
	}

	public GearedBike(String colour) {
		super(colour);
	}

	@Override
	public void go() {
		speed += gear;
	}

	public void shiftUp() {
		gear++;
	}

	public void shiftDown() {
		gear--;
	}

	public int getGear() {
		return gear;
	}

}
