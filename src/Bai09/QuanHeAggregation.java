package Bai09;

import Bai09.vidu2.HoaDon;
import Bai09.vidu2.SanPham;

public class QuanHeAggregation {
	public static void main(String[] args) throws CloneNotSupportedException {
		SanPham sp1 = new SanPham("Cafe đen");
		HoaDon hd = new HoaDon(15);
		hd.addSanPham(sp1);
		SanPham sp2 = new SanPham("Cafe sữa");
		System.out.println(sp2);
		hd.addSanPham(sp2);
		System.out.println(hd);
		sp2.setTenSP("rượu vang");
		System.out.println(sp2);
		System.out.println(hd);
	}
}
