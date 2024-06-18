package bai08;

import bai08.vidu2.SanPham;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		SanPham sp1 = new SanPham("Xiaomi", 7);
		System.out.println(sp1);
		SanPham sp2;
		try {
			sp2 = (SanPham) sp1.clone();
			sp2.setMaSP(15);
			sp2.setTenSP("Nokia");
			System.out.println(sp1);
			System.out.println(sp2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
