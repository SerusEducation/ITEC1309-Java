package test3;

public class Food extends Product {
	private String flavor;

	public Food() {
		super();
	}
	
	public Food(int unit, Double priceUnit, String name, int weight, String flavor) {
		super(unit, priceUnit, name, weight);
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("----------------Food----------------\n");
		sb.append("Name 		: 	"+name+"\n");
		sb.append("Weight 		: 	"+weight+"\n");
		sb.append("Flavor 		: 	"+flavor+"\n");
		sb.append("Unit 		: 	"+unit+"\n");
		sb.append("PricePerUnit	: 	"+priceUnit+"\n");
		sb.append("Pay exclude VAT => "+ pay()+"\n");
		sb.append("Pay include VAT => "+ pay(7)+"\n");
		sb.append("------------------------------------");
		return sb.toString();
	}
	
}
