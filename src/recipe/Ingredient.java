package recipe;

public class Ingredient {

	// data members

	private String name;
	private String unit;
	private double quantity;

	// no argument constructor

	public Ingredient() {

	}

	// normal constructor

	public Ingredient(String name, String unit, double quantity) {
		super();
		this.name = name;
		this.unit = unit;
		this.quantity = quantity;
	}

	// getters and setters

	public String getName() {
		return name;
	}

	// to string

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", unit=" + unit + ", quantity=" + quantity + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
