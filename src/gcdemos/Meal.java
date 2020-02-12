package gcdemos;

import java.util.ArrayList;

public class Meal {
	private String title;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getDishes() {
		return dishes;
	}
	public void setDishes(ArrayList<String> dishes) {
		this.dishes = dishes;
	}
	
	//constructor
	public Meal(String title) {
		this.title= title;
	}
	
	
}
