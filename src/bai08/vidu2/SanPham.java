package bai08.vidu2;

public class SanPham implements Cloneable{
	private int maSP;
	private String tenSP;
	
	public SanPham(String tenSP, int maSP) {
		this.setMaSP(maSP);
		this.setTenSP(tenSP);
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
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
