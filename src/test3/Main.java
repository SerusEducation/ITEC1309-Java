package test3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ให้สร้าง Instace ของ Food เป็น
		// 1. Ezego นำหนัก 100G หวานน้อย จำนวน 5 ชิ้น ชิ้นละ 2 บาท
		// 2. ข้าวมันไก่ น้ำหนัก 150G ปรกติ จำนวน 10 ชิ้น ชิ้น 20.50 บาท
		// ให้สร้าง Instace ของ Snack เป็น
		// 1. ขาไก่ น้ำหนัก 20G หมดอายุ 12/12/2565 จำนวน 6 ชิ้น ชิ้นละ 5 บาท
		// 2. ขนมปิ๊บ น้ำหนัก 1000G หมดอายุ 24/12/256 จำนวน 7 ชิ้น ชิ้นละ 2 บาท

		Food ezego = new Food();
		ezego.setName("Ezego");
		ezego.setWeight(100);
		ezego.setFlavor("หวานน้อย");
		ezego.setUnit(5);
		ezego.setPriceUnit(2.0);

		System.out.println(ezego);

		Food chicken = new Food();
		chicken.setName("ข้าวมันไก่");
		chicken.setWeight(150);
		chicken.setFlavor("ปกติ");
		chicken.setUnit(10);
		chicken.setPriceUnit(20.5);

		System.out.println(chicken);

		// ให้สร้าง Instace ของ Snack เป็น
		// 1. ขาไก่ น้ำหนัก 20G หมดอายุ 12/12/2565 จำนวน 6 ชิ้น ชิ้นละ 5 บาท
		// 2. ขนมปิ๊บ น้ำหนัก 1000G หมดอายุ 24/12/256 จำนวน 7 ชิ้น ชิ้นละ 2 บาท
		Snack chickenLeg = new Snack();
		chickenLeg.setName("ขาไก่");
		chickenLeg.setWeight(20);
		chickenLeg.setExpiredDate("12/12/2565");
		chickenLeg.setUnit(6);
		chickenLeg.setPriceUnit(5.0);

		System.out.println(chickenLeg);

		Snack snackBox = new Snack();
		snackBox.setName("ขนมปิ๊บ");
		snackBox.setWeight(100);
		snackBox.setExpiredDate("24/12/2565");
		snackBox.setUnit(7);
		snackBox.setPriceUnit(2.0);

		System.out.println(snackBox);

	}

}
