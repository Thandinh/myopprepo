package bai3.vidu2;

public class SinhVien {
	public String hoTen;
	public int namSinh;
	public String sdt;
	
	public String getHoten() {
		return this.hoTen;
	}
	
	public void setHoten(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return this.namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public String GetSdt() {
		return this.sdt;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	public String toString() {
		String result = "Ho ten: " + this.getHoten() + ", Nam sinh: " + this.GetSdt() + ", SDT: " + this.sdt;
		return result;
	}
}
