package bai10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bai10.model.SinhVien;

public class SapXepSinhVienVer1 {
	public static void main(String[] args) {
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Loc", 10, 20));
		dssv.add(new SinhVien("Nhat", 9, 18));
		dssv.add(new SinhVien("Binh", 8, 19));
		System.out.println(dssv);
		
		Collections.sort(dssv);
	}
}
