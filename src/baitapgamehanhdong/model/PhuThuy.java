package baitapgamehanhdong.model;

public class PhuThuy extends NhanVat {
	

	private boolean choi;
	private boolean gay;
	
	public PhuThuy(String ten, String id, byte gioiTinh, double nangLuong, boolean choi, boolean gay) {
		super(ten, id, gioiTinh, nangLuong);
		this.setChoi(choi);
		this.setGay(gay);
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
	
	
	public void nhanVatdiChuyen() {
		System.out.println("Cưỡi chổi bay");
		
	}
	
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + ", getTen()=" + getTen() + ", getId()=" + getId()
				+ ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()=" + getNangLuong() + "]";
	}

	public void hanhDongVuKhi() {
		System.out.println("Vừa bay vừa cầm gậy đánh");
	}
	
	public void sucManhVuKhi() {
		double energy = this.getNangLuong() * 1.7;
		System.out.println("Sức mạnh vũ khí của phù thủy là: " + energy);
		
	}
	
	

}
