package edu.pxu.lthdt.bai06;

public class KyBinh extends NhanVat implements DiChuyen, TanCong{
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	public KyBinh(String ten, String id, byte gioiTinh, double nangLuong, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, gioiTinh, nangLuong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	
	
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	public boolean isGiao() {
		return giao;
	}
	
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	
	public boolean isCung() {
		return cung;
	}
	
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	
	public boolean isNgua() {
		return ngua;
	}
	
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	


	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", getTen()="
				+ getTen() + ", getId()=" + getId() + ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()="
				+ getNangLuong() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public void hanhDong() {
		System.out.println("Coi ngua va ban ten");
	}
	@Override
	public void sucManh() {
		double energy = this.getNangLuong() * 2;
		System.out.println("Suc manh cua ky binh la: " + energy);
	}


	@Override
	public void tanCongKhongVuKhi() {
		System.out.println("Kỵ binh tấn công không vũ khí");
		
	}


	@Override
	public void tanCongCoVuKhi() {
		System.out.println("Kỵ binh tấn công có vũ khí");
		
	}


	@Override
	public void SangPhai() {
		System.out.println("Kỵ binh sang phải");
		
	}


	@Override
	public void sangTrai() {
		System.out.println("Kỵ binh sang trái");
		
	}


	@Override
	public void nhayLen() {
		System.out.println("Kỵ binh nhảy lên");
		
	}


	@Override
	public void boChay() {
		System.out.println("Kỵ binh bỏ chạy");
		
	}
	
	
	
}
