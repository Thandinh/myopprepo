package bai4.vidu1;


public class Nguoi {
	private String hoTen;
	private int namSinh;
	public Nguoi(String hoTen, int namSinh) {
		this.setHoTen(hoTen);
		this.setNamSinh(namSinh);
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

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", namSinh=" + namSinh + "]";
	}
	
	
}
