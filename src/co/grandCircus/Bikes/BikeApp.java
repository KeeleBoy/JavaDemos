package co.grandCircus.Bikes;

public class BikeApp {

	public static void main(String[] args) {
		Bike redBike = new Bike("red");
		System.out.println(redBike);
		System.out.println(redBike.getColour());
		System.out.println(redBike.getSpeed());
		redBike.go();
		redBike.go();
		System.out.println(redBike);

		Bike mysteryBike = new Bike();
		System.out.println(mysteryBike.getColour());
		System.out.println(mysteryBike.getSpeed());

		GearedBike bike3 = new GearedBike();
		System.out.println(bike3.getColour());
		System.out.println(bike3.getSpeed());
		bike3.shiftUp();
		bike3.shiftUp();
		System.out.println(bike3);

		GearedBike bkke4 = new GearedBike("Purple");
		System.out.println(bkke4.getColour());
		System.out.println(bkke4.getSpeed());
		System.out.println(bkke4.getGear());
		System.out.println(bkke4);

		ElectricBike bke1 = new ElectricBike("blue");
		System.out.println(bke1.getColour());
		System.out.println(bke1.getSpeed());
		System.out.println(bke1.charge);
		System.out.println(bke1);

	}

}
