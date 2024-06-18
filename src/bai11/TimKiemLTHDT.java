package bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bai11.model.SinhVien;

public class TimKiemLTHDT {

	public static void main(String[] args) {
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Thong", 10, 17));
		dssv.add(new SinhVien("Quy", 9, 19));
		dssv.add(new SinhVien("Nhi", 9, 20));
		dssv.add(new SinhVien("Quang", 7, 18));
		System.out.println("Danh sach sinh vien ban dau");
		for(SinhVien item: dssv) {
			System.out.println(item);
		}
		System.out.println("--------------------------");
		SinhVien sv_dtb_min = Collections.min(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
			
		});
	
		System.out.println(sv_dtb_min);
		System.out.println("---------------------------------");
		System.out.println("Sinh vien co tuoi lon nhat");
		SinhVien sv_tuoi_max = Collections.max(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getTuoi(), o2.getTuoi());
			}
			
		});
		System.out.println("Sinh vien co diem cao nhat la");
		System.out.println(sv_tuoi_max);
		System.out.println("---------------------");
		int viTri = Collections.binarySearch(dssv, new SinhVien("Quy", 0, 0), new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
		
		});
		if(viTri < 0) {
			System.out.println("Không tìm thấy");
		}else {
			System.out.println("vi tri sv co ten la Quy: " +viTri );
			System.out.println(dssv.get(viTri));
		}
		System.out.println("------------------");
//		Buoc 5 su dung Stream va cu phap Lambda
		List<SinhVien> kqLoc = dssv.stream()
				.filter(sv -> sv.getDtb() >= 8)
				.filter(sv -> sv.getDtb() <= 10)
				.filter(sv -> sv.getTuoi() >= 18)
				.filter(sv -> sv.getTuoi() <= 20)
				.toList();
		System.out.println("Ket qua loc du lieu");
		for(SinhVien item: kqLoc) {
			System.out.println(item);
		}
//		Buoc 6: xay dung menh de logic - Predicate
//		Loc tat ca sinh vien co 8 <= dtb <= 10 OR 18 <= tuoi <= 20
		Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
			
			@Override
			public boolean test(SinhVien t) {
				// TODO Auto-generated method stub
				return t.getDtb() >= 8 && t.getDtb() <= 10;
			}
		};
//		xay dung menh de logic 18 <= tuoi <= 20
		Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {
			
			@Override
			public boolean test(SinhVien t) {
				// TODO Auto-generated method stub
				return t.getTuoi() >= 18 && t.getTuoi() <= 20;
			}
		};
		List<SinhVien> dskq = dssv.stream()
				.filter(dk_dtb.or(dk_tuoi))
				.toList();
		System.out.println("Xuat ket qua su dung vi tu Predicate");
		for(SinhVien item: dskq) {
			System.out.println(item);
		}
				
		
	}

}
