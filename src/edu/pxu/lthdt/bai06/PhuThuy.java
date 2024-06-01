package edu.pxu.lthdt.bai06;

public class PhuThuy extends NhanVat implements DiChuyen, TanCong {
	private boolean choi;
	private boolean gay;
	
	
	public PhuThuy(String ten, String id, byte gioiTinh, double nangLuong, boolean choi, boolean gay) {
		super(ten, id, gioiTinh, nangLuong);
		this.choi = choi;
		this.gay = gay;
	}


	public boolean isChoi() {
		return choi;
	}


	public void setChoi(boolean choi) {
		this.choi = choi;
	}


	public boolean isGay() {
		return gay;
	}


	public void setGay(boolean gay) {
		this.gay = gay;
	}


	


	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + ", getTen()=" + getTen() + ", getId()=" + getId()
				+ ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()=" + getNangLuong() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public void hanhDong() {
		System.out.println("Bay");
	}


	@Override
	public void sucManh() {
		double energy = this.getNangLuong() * 1.7;
		System.out.println("Suc manh cua phu thuy la: " + energy);
	}


	@Override
	public void tanCongKhongVuKhi() {
		System.out.println("Phù thủy tấn công không vũ khí");
		
	}


	@Override
	public void tanCongCoVuKhi() {
		System.out.println("Phù thủy tấn công có vũ khí");
		
	}


	@Override
	public void SangPhai() {
		System.out.println("Phù thủy sang phải");
		
	}


	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nhayLen() {
		System.out.println("Phù thủy nhảy lên");
		
	}


	@Override
	public void boChay() {
		System.out.println("Phù thủy bỏ chạy");
		
	}
	
	
	
	
}
