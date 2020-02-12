package recipe;

public class BakingRecipe extends Recipe {

	private int ovenTemperature;

	public BakingRecipe() {

	}

	public BakingRecipe(String title, int ovenTemperature) {
		super(title);
		this.ovenTemperature = ovenTemperature;
	}

	public int getOvenTemperature() {
		return ovenTemperature;
	}

	public void setOvenTemperature(int ovenTemperature) {
		this.ovenTemperature = ovenTemperature;
	}

	@Override
	public String toString() {
		return "BakingRecipe [ovenTemperature=" + ovenTemperature + "]";
	}

}
