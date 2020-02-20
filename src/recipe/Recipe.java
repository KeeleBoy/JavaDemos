package recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	// to string

	@Override
	public String toString() {
		return "Recipe [title=" + title + ", instructions=" + instructions + ", ingredients=" + ingredients​ + "]";
	}

	// private fields

	private String title;
	private List<Ingredient> ingredients​;
	private String instructions;

	// no argument constructor

	public Recipe() {

	}

	// normal constructor

	public Recipe(String title) {
		super();
		this.title = title;
		// you are initializing variables here
		// DON'T FORGET ON A TEST
		this.ingredients​ = new ArrayList<>();
		this.instructions = "N/A";
	}

	// getters and setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Ingredient> getIngredients​() {
		return ingredients​;
	}

	public void setIngredients​(List<Ingredient> ingredients​) {
		this.ingredients​ = ingredients​;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

}
