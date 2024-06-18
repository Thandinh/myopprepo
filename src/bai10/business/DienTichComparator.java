package bai10.business;

import java.util.Comparator;

import bai10.model3.HinhHoc;

public class DienTichComparator implements Comparator<HinhHoc> {

	@Override
	public int compare(HinhHoc o1, HinhHoc o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
	}

}
