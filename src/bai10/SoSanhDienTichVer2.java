package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bai10.business.DienTichComparator;
import bai10.model3.HinhHoc;
import bai10.model3.HinhTron;
import bai10.model3.HinhVuong;

public class SoSanhDienTichVer2 {
	public static void main(String[] args) {
		List<HinhHoc> dshh = new ArrayList<HinhHoc>();
		dshh.add(new HinhVuong(12));
		dshh.add(new HinhTron(6.5));
		dshh.add(new HinhVuong(1.5));
		dshh.add(new HinhTron(0.75));
		dshh.add(new HinhVuong(8));
		dshh.add(new HinhTron(12));
		System.out.println("sap xep hinh dien tich tang dan");
		Collections.sort(dshh, new DienTichComparator());
		for(HinhHoc item: dshh) {
			System.out.println(item);
		}
	}
}
