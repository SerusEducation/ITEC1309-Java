package test3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ҧ Instace �ͧ Food ��
		// 1. Ezego ��˹ѡ 100G ��ҹ���� �ӹǹ 5 ��� ����� 2 �ҷ
		// 2. �����ѹ�� ���˹ѡ 150G �á�� �ӹǹ 10 ��� ��� 20.50 �ҷ
		// ������ҧ Instace �ͧ Snack ��
		// 1. ���� ���˹ѡ 20G ������� 12/12/2565 �ӹǹ 6 ��� ����� 5 �ҷ
		// 2. ������ ���˹ѡ 1000G ������� 24/12/256 �ӹǹ 7 ��� ����� 2 �ҷ

		Food ezego = new Food();
		ezego.setName("Ezego");
		ezego.setWeight(100);
		ezego.setFlavor("��ҹ����");
		ezego.setUnit(5);
		ezego.setPriceUnit(2.0);

		System.out.println(ezego);

		Food chicken = new Food();
		chicken.setName("�����ѹ��");
		chicken.setWeight(150);
		chicken.setFlavor("����");
		chicken.setUnit(10);
		chicken.setPriceUnit(20.5);

		System.out.println(chicken);

		// ������ҧ Instace �ͧ Snack ��
		// 1. ���� ���˹ѡ 20G ������� 12/12/2565 �ӹǹ 6 ��� ����� 5 �ҷ
		// 2. ������ ���˹ѡ 1000G ������� 24/12/256 �ӹǹ 7 ��� ����� 2 �ҷ
		Snack chickenLeg = new Snack();
		chickenLeg.setName("����");
		chickenLeg.setWeight(20);
		chickenLeg.setExpiredDate("12/12/2565");
		chickenLeg.setUnit(6);
		chickenLeg.setPriceUnit(5.0);

		System.out.println(chickenLeg);

		Snack snackBox = new Snack();
		snackBox.setName("������");
		snackBox.setWeight(100);
		snackBox.setExpiredDate("24/12/2565");
		snackBox.setUnit(7);
		snackBox.setPriceUnit(2.0);

		System.out.println(snackBox);

	}

}
