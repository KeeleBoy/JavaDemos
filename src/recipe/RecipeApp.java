package recipe;

public class RecipeApp {

	public static void main(String[] args) {
		// class name / name choice / = / new / class name
		Recipe r = new Recipe("S'more");
		Recipe b = new BakingRecipe("BakingRecipe", 350);

		b.getIngredients​().add(new Ingredient("Apple", "", 5.0));
		b.getIngredients​().add(new Ingredient("sugar", "c", 0.125));
		b.getIngredients​().add(new Ingredient("Cinnamon", "TBSP", 1.0));

		b.setInstructions("Cut apples in halves or quarters and remove cores. Place in bakingdish. "
				+ "Sprinkle with sugar and cinnamon. Bake at 350 for 30 minutes.");

		r.getIngredients​().add(new Ingredient("Marshmellow", "", 1.0));
		r.getIngredients​().add(new Ingredient("Chocolate", "oz", 0.5));
		r.getIngredients​().add(new Ingredient("Grahm cracker", "", 1.0));

		// this is using a setter because setters are used to set values with access
		// modifiers
		r.setInstructions("Toast marshmallow. Place chocolate and hot marshmallow on onehalf of Graham cracker. "
				+ "Then place other half of the cracker on top to form asandwich.");

		System.out.println(r.getTitle());
		System.out.println(b.getTitle());

		// enhanced for loop // for (data type, name : list to loop through)

		for (Ingredient ing : r.getIngredients​()) {
			System.out.println(ing);
		}

		for (Ingredient abc : b.getIngredients​()) {
			System.out.println(abc);
		}

		System.out.println(r.getInstructions());
		System.out.println(b.getInstructions());

	}

}
