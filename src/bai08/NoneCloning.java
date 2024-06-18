package bai08;

import bai08.vidu1.SanPham;

public class NoneCloning {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham(12, "Xiaomi");
		System.out.println(sp1);
		SanPham sp2 = sp1;
		sp2.setTenSP("Nokia");
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
