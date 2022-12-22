package test;

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Total Price = ");
		int totalPrice = sc.nextInt();
		
		System.out.print("Total pay = ");
		int totalPay = sc.nextInt();
		
		sc.close();
		
		System.out.println("totalPrice = "+totalPrice);
		System.out.println("totalPay   = "+totalPay);
		final int change = totalPrice - totalPay;
		System.out.println("totalChange   = "+change);
		Change(change, 0);
	}
	
	public static void Change(int cash, int i) {
		int[] money = {1000, 500, 100, 50, 20, 10, 5, 1};
		int b, x, y = money[i], z = cash;
		x = z / y;
		b = z % y;
		
		System.out.printf("M%s: %s\n", y, x);
		if (i < 7) {
			Change(b, ++i);
		}
	}
}
