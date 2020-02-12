package gcdemos;

import java.util.*;

public class FoodMain {

	public static void main(String[] args) {

		String[] nutrients = new String[3];
		nutrients[0] = ("VitaminD");
		nutrients[1] = ("VitaminC");
		nutrients[2] = ("Vitamina");

		Food[] foods = new Food[3];
		foods[0] = new Food("Pie", 200);
		foods[1] = new Veggie(nutrients, "tomato", 300);
		foods[2] = new Food("human flesh", 100);

	}

}
