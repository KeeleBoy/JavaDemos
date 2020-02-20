package recipe;

// the extends recipe makes this a child class of recipe

public class BakingRecipe extends Recipe {

	// another field

	private int ovenTemperature;

	// no argument constructor

	public BakingRecipe() {

	}

	// over loaded constructor

	public BakingRecipe(String title, int ovenTemperature) {
		super(title);
		this.ovenTemperature = ovenTemperature;
	}

	// getters and setters below

	public int getOvenTemperature() {
		return ovenTemperature;
	}

	public void setOvenTemperature(int ovenTemperature) {
		this.ovenTemperature = ovenTemperature;
	}

	// to string

	@Override
	public String toString() {
		return "BakingRecipe [ovenTemperature=" + ovenTemperature + "]";
	}

}
