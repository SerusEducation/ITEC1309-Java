package test3;

public class Product {
	protected int unit;
	protected Double priceUnit;
	protected String name;
	protected int weight;
	
	public Product(int unit, Double priceUnit, String name, int weight) {
		super();
		this.unit = unit;
		this.priceUnit = priceUnit;
		this.name = name;
		this.weight = weight;
	}

	public Product() {
		super();
	}

	public Double pay() {
		return (double)unit * priceUnit;
	}
	
	public Double pay(int vat) {
		return pay() + (pay() * vat / 100); 
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Double getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(Double priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
