package gcdemos;

public class MethodDemo {

	public static void main(String[] args) {
		
		
		//always do public static variable(variablename,
		
		//non-static method called using an INSTANCE of the class
		MethodDemo m = new MethodDemo();
		m.greeting();
		
		
		//static method sayHello is static
		sayHello();
		String name1 = "Flack";
		sayHello("Roberta" + name1);
		//MethodDemo.sayHello();
		
		//int roboAge = robotDemo.getRobotAge(70);
		
		//robotDemo robbie = new Robot();
		

	}
	public void greeting() {
		
		System.out.println("Hello!");
	}
	
	public static void sayHello() {
		System.out.println(Hello);
	}
	
	//overloaded sayHello() method
	public static void sayHello(String s) {
		System.out.println("Hello" + s);
		
	}
	
	public static void sayHello(String name1, String name2) {
		System.out.println("Hello " + name1 + "hello " + name2);
		
		
		
	}

}
