package bai05;

import bai5.vidu2.MathHelper;

public class Math {
	public static void main(String[] args) {
		MathHelper obj1 = new MathHelper();
		int tongSoNguyen = obj1.sum(15, 30);
		System.out.println("Tổng 2 số nguyên là: " + tongSoNguyen);
		System.out.println("Tổng 2 số thực là: " + obj1.sum(1.25, 3.13));
	}
}
