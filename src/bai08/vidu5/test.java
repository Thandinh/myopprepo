package bai08.vidu5;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham(1, "Apple"));
		dssp.add(new SanPham(2, "Xiaomi"));
		HoaDon hd1 = new HoaDon(1, dssp);
		System.out.println("Hoa Don 1: " + hd1);
		HoaDon hd2;
		try {
			hd2 = (HoaDon) hd1.clone();
			hd2.setMaHoaDon(15);
			hd2.getDssp().getFirst().setMaSP(18);
			hd2.getDssp().getFirst().setTenSP("Nokia");
			System.out.println("Hoa Don 1: " + hd1);
			System.out.println("Hoa Don 2: " + hd2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
