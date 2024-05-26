package bai3.vidu4;

public class SinhVien {
	private String hoTen;
	private int namSinh; 
	private String sdt;
	
	public SinhVien(String hoTen, int namSinh, String sdt) {
		super();
		this.hoTen = hoTen;
		this.setNamSinh(namSinh);
		this.sdt = sdt;
	}


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
			System.out.println("Năm sinh " + namSinh + " Không hợp lệ");
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
		return "SinhVien [hoTen=" + hoTen + ", namSinh=" + namSinh + ", sdt=" + sdt + "]";
	}
	
	
	
}
