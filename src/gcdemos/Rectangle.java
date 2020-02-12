package gcdemos;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(int i) {

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

	}

}
