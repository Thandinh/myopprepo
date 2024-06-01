package bai05.baitap;

public class PhuThuy extends NhanVat {
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
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
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
	
	
	
	
}
