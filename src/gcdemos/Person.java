package gcdemos;

public class Person {

	// instance variables go inside the class
	// these are the fields of the class

	private String name;
	// default value is 1
	private int age = 1;
	private int fingers = 10;

	// class variable
	public final static int EMOTIONAL_IQ = 2;

	// class methods
	public static void greeting() {

		System.out.println("Everybody poops.");

	}

	public static int getTears(int viewings) {
		return EMOTIONAL_IQ * viewings;

	}

	// default no argument constructor
	public Person() {
//		super();
//		this.name = null;
//		this.age = 0;
		age = 1;
//		don't have to add this.

	}

	// code is reusable
	// over-loaded
	// takes different parameters
	public Person(String n, int age) {

		name = n;
		this.age = age;

	}

	Person(String name, int age, int fingers) {
		this.name = name;
		this.age = age;
		this.fingers = fingers;

	}

	// instance methods
	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setFingers(int fingers) {
		this.fingers = fingers;
	}

	public int getFingers() {
		return fingers;
	}

	// instance method calling getter and instance variable
	public String getNameTag() {
		return "Hey " + getName() + " you are " + age + " years old!";
	}

	@Override
	public String toString() {
		// you don't print here you return a string here and print elsewhere
		// %d for digits %f for floats
		return String.format("Person[name: %s,age: %d,fingers: %d", name, age, fingers);
		// return "Person[name="+name+",age="+age+"]";
	}

}
