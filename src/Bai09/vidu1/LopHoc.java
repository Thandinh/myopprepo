package Bai09.vidu1;

import java.util.ArrayList;

public class LopHoc {
	private String tenLop;
	private ArrayList<SinhVien> dssv;
	
	public LopHoc(String tenLop, ArrayList<SinhVien> dssv) {
		super();
		this.setTenLop(tenLop);;
		this.setDssv(dssv);;
	}
	
	public LopHoc(String tenLop) {
		this.setTenLop(tenLop);
		this.dssv = new ArrayList<SinhVien>();
	}
	
	public void addSinhVien(SinhVien sv) {
		this.dssv.add(sv);
	}
	
	
	public String getTenLop() {
		return tenLop;
	}
	
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
	public ArrayList<SinhVien> getDssv() {
		return dssv;
	}
	
	public void setDssv(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}


	@Override
	public String toString() {
		return "LopHoc [tenLop=" + tenLop + ", dssv=" + dssv + "]";
	}


	
	
	
	
	
}
