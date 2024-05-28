package baitapkethua.baitap01;
import java.time.LocalDate;

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
		LocalDate ngayHienTai = LocalDate.now();
		int namHienTai = ngayHienTai.getYear();
		if(namSinh <= 1900 || namSinh >= namHienTai) {
			System.out.println("Năm sinh " + namSinh + " Không hợp lệ");
		}else {
			this.namSinh = namSinh;
		}
	}

	@Override
	public String toString() {
		if(namSinh == 0) {
			return "[hoTen=" + hoTen + "]";
		}else {
			return "[hoTen=" + hoTen + ", namSinh=" + namSinh + "]";
		}
	}
	
	
	
	
	
	
	
	
}
