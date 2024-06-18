package Bai09;

import Bai09.vidu3.BanhXe;
import Bai09.vidu3.DongCo;
import Bai09.vidu3.XeHoi;

public class QuanHeCompostion {
	public static void main(String[] args) throws CloneNotSupportedException {
		DongCo dc = new DongCo("xăng");
		System.out.println("Động cơ ban đầu: " + dc);
		XeHoi car = new XeHoi(dc);
		BanhXe bx1 = new BanhXe(1.5);
		BanhXe bx2 = new BanhXe(1.5);
		BanhXe bx3 = new BanhXe(1.5);
		BanhXe bx4 = new BanhXe(1.5);
		car.addBanhXe(bx1);
		car.addBanhXe(bx2);
		car.addBanhXe(bx3);
		car.addBanhXe(bx4);
		System.out.println(car);
		System.out.println("Thay đổi khi có Clone và không có clone");
		dc.setLoaiDongCo("Động cơ điện");
		System.out.println("Động cơ thay đổi: " + dc);
		bx1.setBanKinh(1.8);
		System.out.println(car);
	}
}
