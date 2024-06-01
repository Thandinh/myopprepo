package edu.pxu.lthdt.bai05;

public class BoBinh extends NhanVat{
	private int giap;
	private boolean khien;
	private boolean aoGiap;
	
	public BoBinh(String ten, String id, byte gioiTinh, double nangLuong) {
		super(ten, id, gioiTinh, nangLuong);
		// TODO Auto-generated constructor stub
	}

	public int getGiap() {
		return giap;
	}

	public void setGiap(int giap) {
		this.giap = giap;
	}

	public boolean isKhien() {
		return khien;
	}

	public void setKhien(boolean khien) {
		this.khien = khien;
	}

	public boolean isAoGiap() {
		return aoGiap;
	}

	public void setAoGiap(boolean aoGiap) {
		this.aoGiap = aoGiap;
	}

	
	
	@Override
	public String toString() {
		return "BoBinh [giap=" + giap + ", khien=" + khien + ", aoGiap=" + aoGiap + ", getTen()=" + getTen()
				+ ", getId()=" + getId() + ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()=" + getNangLuong()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void hanhDong() {
		System.out.println("Dam giao");
	}

	@Override
	public void sucManh() {
		double energy = this.getNangLuong() * 1;
		System.out.println("Suc manh cua bo binh la: " + energy);
	}
	
	
	
}
