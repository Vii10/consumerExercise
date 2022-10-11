package entities;

public class Product {
	
	private String name;
	private double value;
	
	public Product(String name, double value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public static void priceUpdater(Product p) {
		p.setValue(p.getValue() * 1.1);
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", value);
	}
	
}
