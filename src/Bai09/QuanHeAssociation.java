package Bai09;

import Bai09.vidu1.LopHoc;
import Bai09.vidu1.SinhVien;

public class QuanHeAssociation {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("Nguyen Van A", new LopHoc("K21 CNTT"));
		System.out.println(sv);
		LopHoc lop = new LopHoc("K21 CNTT");
		lop.addSinhVien(sv);
		System.out.println(lop);
	}
}
