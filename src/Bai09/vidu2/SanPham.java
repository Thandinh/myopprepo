package Bai09.vidu2;

public class SanPham implements Cloneable{
	private String tenSP;

	public SanPham(String tenSP) {
		super();
		this.setTenSP(tenSP);;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	@Override
	public String toString() {
		return "SanPham [tenSP=" + tenSP + "]";
	}

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
}
