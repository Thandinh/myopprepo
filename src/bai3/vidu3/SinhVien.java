package bai3.vidu3;

public class SinhVien {
	private String hoTen;
	private int namSinh;
	private String sdt;
	
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		if(namSinh <= 1900) {
			System.out.println("Năm sinh " + namSinh + " không hợp lệ");
		}else {
			this.namSinh = namSinh;
			
		}
		
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Override
	public String toString() {
		if(this.namSinh == 0) {
			return "SinhVien [hoTen=" + hoTen + ", sdt=" + sdt + "]";
		}
		return "SinhVien [hoTen=" + hoTen + ", namSinh=" + namSinh + ", sdt=" + sdt + "]";
	}
	
	
	
}
