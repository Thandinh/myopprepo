package baitapdeepcloning;

public class VuKhi {
	private String vuKhi;
	private int soLuong;
	
	
	
	public VuKhi(String vuKhi, int soLuong) {
		this.setVuKhi(vuKhi);
		this.setSoLuong(soLuong);
	}

	public String getVuKhi() {
		return vuKhi;
	}
	
	public void setVuKhi(String vuKhi) {
		this.vuKhi = vuKhi;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "VuKhi [vuKhi=" + vuKhi + ", soLuong=" + soLuong + "]";
	}
	
	
	

}
