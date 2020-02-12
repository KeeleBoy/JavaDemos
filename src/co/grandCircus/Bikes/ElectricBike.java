package co.grandCircus.Bikes;

public class ElectricBike extends Bike {

	protected int charge = 10;

	public ElectricBike() {
		super();

	}

	public ElectricBike(String colour) {
		super(colour);
	}

	public int getCharge() {
		return charge;
	}

	@Override
	public void go() {
		if (charge >= 1) {
			// super.go(); better choice for speed++ does the math based on the method
			// rather than just adding 1
			speed++;
			charge--;
		} else
			speed = 0;
		super.go();
	}

	@Override
	public String toString() {
		return "ElectricBike [charge=" + charge + ", colour=" + colour + ", speed=" + speed + "]";
	}

	public void reCharge() {
		charge = 10;
	}

	public void shiftChargeDown() {
		charge--;
	}

}
