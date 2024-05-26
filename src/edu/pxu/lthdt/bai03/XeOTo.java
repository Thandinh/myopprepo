package edu.pxu.lthdt.bai03;

public class XeOTo {
	private String hangXe;
	private int namSX;
	private float dongCo;
	
	public XeOTo(String hangXe, int namSX, float dongCo) {
		this.hangXe = hangXe;
		this.setNamSX(namSX);
		this.dongCo = dongCo;
		
	}
	
	public String getHangXe() {
		return this.hangXe;
	}
	
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	
	public int getNamSX() {
		return this.namSX;
	}
	
	public void setNamSX(int namSX) {
		if(namSX <= 1885 || namSX >= 2025) {
			System.out.println("Bạn đã nhập sai dữ liệu");
		}else {
			this.namSX = namSX;
		}
	}
	
	public float getDongCo() {
		return this.dongCo;
	}
	
	public void setDongCo(float dongCo) {
		this.dongCo = dongCo;
	}

	@Override
	public String toString() {
		return "XeOTo [hangXe=" + hangXe + ", namSX=" + namSX + ", dongCo=" + dongCo + "]";
	}
	
	
	
}
