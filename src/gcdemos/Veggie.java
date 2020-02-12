package gcdemos;

public class Veggie extends Food {
	protected String[] nutrients;

	public String[] getNutrients() {
		return nutrients;
	}

	public void setNutrients(String[] nutrients) {
		this.nutrients = nutrients;
	}

	public Veggie(String[] nutrients, String name, int calories) {
		super(name, calories);
		this.nutrients = nutrients;
	}
	
	
}
