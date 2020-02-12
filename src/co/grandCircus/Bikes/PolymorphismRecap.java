package co.grandCircus.Bikes;

public class PolymorphismRecap {
	public static void main(String[] args) {
		Bike bike = new Bike();
		GearedBike gearedBike = new GearedBike();
		Bike bike2 = new GearedBike();

		bike.go();
		gearedBike.go();
//		bike.shiftUp();

	}

}
