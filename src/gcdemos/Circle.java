package gcdemos;

public class Circle implements Shape {

	private double radius;

	public Circle(int i) {

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

	}

}
