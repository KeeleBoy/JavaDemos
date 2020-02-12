package gcdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/*
 * @Author Kyle Warchuck
 * 
 */

//List ordered add get
//Set unique add get
//Map key-value put get

class Box<T> {
	boolean value;

	public void something() {
		System.out.println("Generic!");
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();

//		Box<Integer> myClass = new Box<>();
//		myClass.value = 1000;
//		myClass.printSomething();
//		System.out.println(myClass.value);

		values.add(12);

//		adding a string
//		values.add("Hid");

		values.add(14);
		values.add(25);

//		add at specific index
//		adding at an index lowers other values rather than replacing
		values.add(0, 450);

		System.out.println(values);
//		prints how many are in the array
		System.out.println(values.size());

//		returns a specific value that we specify 
//		Adding an element at the beginning of the list
//		Ordered with insertion 
		System.out.println(values.get(0));

//		Sorting 
		Collections.sort(values);
		System.out.println("Sorted \n" + values);

//		removing a value
//		int num = values.indexOf(450);
		int num = values.get(3);
		Integer number = num;

		values.remove(number);
		System.out.println(num + " " + values);

		/*
		 * 
		 * map things
		 * 
		 */

//		how to set up a map
		Map<String, Double> items = new HashMap<>();

//		items in out map
		items.put("toaster", 350.0);
		items.put("Dongle", 5.99);
		items.put("Shamwow", 19.99);
		items.put("Flex Seal Tape", 19.99);

		Set<String> setOfKeys = items.keySet();

//		counting variable
		int counter = 1;

//		loop through and print each
		for (String key : setOfKeys) {
			System.out.println(counter++ + ". " + key + " $" + items.get(key));

		}
//		see if your data holds a certain value
		System.out.println(items.containsKey("Shamwow"));
		System.out.println(items.containsValue(19.99));

//		how to set up a set
		Set<Character> letters = new TreeSet<>();

//		making the set
		letters.add('a');
		letters.add('c');
		letters.add('b');
		letters.add('a');

//		remove a letter from the set
		letters.remove('b');

//		see if the set contains a certain letter
		System.out.println(letters.contains('f'));

//		prints set
		System.out.println(letters);

//		letters.getClass();

//		
		LinkedList<String> food = new LinkedList<>();

//		
		food.add("Mud");
		food.add("Carrots");
		food.add("Saurkraut");
		food.add(1, "Margrine");

		food.clear();

		String marge = food.get(0);

		Collections.sort(food);

		System.out.println(food.toString());

		Queue<String> cities = new PriorityQueue<>();

//		adds element to end of que
		cities.offer("Vienna");
		cities.offer("Detroit");
		cities.offer("Windsor");
		cities.offer("Los Angeles");

		System.out.println(cities.peek());

//		removes element from front of cube
		cities.poll();

		System.out.println(cities);

		Stack<String> dishes = new Stack<>();

		dishes.add("Cereal bowl");
		dishes.add("Lunch tray");
		dishes.add("Pots and Pans");
		dishes.add("Dinner fork");

		System.out.println(dishes.peek());

		dishes.pop();
		dishes.pop();

		System.out.println(dishes);

	}
}
