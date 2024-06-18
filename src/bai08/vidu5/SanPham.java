package bai08.vidu5;

public class SanPham {
	private int maSP;
	private String tenSP;
	
	public SanPham(int maSP, String tenSP) {
		this.maSP = maSP;
		this.tenSP = tenSP;
	}

	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + "]";
	}
	
	

}
