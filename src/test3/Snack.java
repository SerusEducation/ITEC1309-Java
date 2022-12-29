package test3;

public class Snack extends Product {

	private String expiredDate;
	
	public Snack() {
		super();
	}

	public Snack(int unit, Double priceUnit, String name, int weight, String expiredDate) {
		super(unit, priceUnit, name, weight);
		this.expiredDate = expiredDate;
	}

	public String getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("---------------Snack----------------\n");
		sb.append("Name 		: 	"+name+"\n");
		sb.append("Weight 		: 	"+weight+"\n");
		sb.append("Expired Date	: 	"+expiredDate+"\n");
		sb.append("Unit 		: 	"+unit+"\n");
		sb.append("PricePerUnit	: 	"+priceUnit+"\n");
		sb.append("Pay exclude VAT => "+ pay()+"\n");
		sb.append("Pay include VAT => "+ pay(7)+"\n");
		sb.append("------------------------------------");
		return sb.toString();
	}
}
