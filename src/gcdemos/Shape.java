package gcdemos;

import java.util.ArrayList;

public interface Shape {
	void calcArea();

	ArrayList<Shape> shapes = new ArrayList<>();

	Rectangle rectangle1 = new Rectangle();
	shapes.add(rectangle1);
	Rectangle rectangle2 = new Rectangle(7);
	Rectangle rectangle3 = new Rectangle(3);

	Circle circle1 = new Circle(12);
	Circle circle2 = new Circle(5);
	Circle circle3 = new Circle(22);

	if(rectangle1>rectangle2&&rectangle1>rectangle3)
	{
		System.out.println(rectangle1);
	}else if(rectangle2>rectangle1&&rectangle2>rectangle3)
	{
		System.out.println(rectangle2);
	}else
	{
		System.out.println(rectangle3);
	}if(circle1>circle2&&circle1>circle3)
	{
		System.out.println(circle1);
	}else if(circle2>circle1&&circle2>circle3)
	{
		System.out.println(circle2);
	}else
	{
		System.out.println(circle3);
	}
}

}
