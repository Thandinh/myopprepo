package edu.pxu.lthdt.bai06;

public class KiemKhach extends NhanVat implements DiChuyen, TanCong{
	private int soKiem;
	private int capDoSuDung;
	
	
	public KiemKhach(String ten, String id, byte gioiTinh, double nangLuong, int soKiem, int capDoSuDung) {
		super(ten, id, gioiTinh, nangLuong);
		this.soKiem = soKiem;
		this.capDoSuDung = capDoSuDung;
	}
	
	
	
	public int getSoKiem() {
		return soKiem;
	}


	public void setSoKiem(int soKiem) {
		this.soKiem = soKiem;
	}


	public int getCapDoSuDung() {
		return capDoSuDung;
	}


	public void setCapDoSuDung(int capDoSuDung) {
		this.capDoSuDung = capDoSuDung;
	}
	
	


	
	@Override
	public String toString() {
		return "KiemKhach [soKiem=" + soKiem + ", capDoSuDung=" + capDoSuDung + ", getTen()=" + getTen() + ", getId()="
				+ getId() + ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()=" + getNangLuong() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	public void hanhDong() {
		System.out.println("Vung kiem chep");
	}
	
	public void sucManh() {
		double energy = this.getNangLuong() * 1.5;
		System.out.println("Suc manh cua kiem khach la: " + energy);
	}



	@Override
	public void tanCongKhongVuKhi() {
		System.out.println("Kiếm khách tấn công không vũ khí");
		
	}



	@Override
	public void tanCongCoVuKhi() {
		System.out.println("Kiếm khách tấn công có vũ khí");
		
	}



	@Override
	public void SangPhai() {
		System.out.println("Kiếm khách sang phải");
		
	}



	@Override
	public void sangTrai() {
		System.out.println("Kiếm khách sang trái");
		
	}



	@Override
	public void nhayLen() {
		System.out.println("Kiếm khách nhảy lên");
		
	}



	@Override
	public void boChay() {
		System.out.println("Kiếm khách bỏ chạy");
		
	}
	
	

}
