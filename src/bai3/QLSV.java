package bai3;

public class QLSV {
	public static void main(String[] args) {
		SinhVien sv;
		sv = new SinhVien();
		sv.hoTen = "Nguyễn Văn A";
		sv.namSinh = 2004;
		sv.sdt = "0892332421";
		System.out.println("Ho ten: " + sv.hoTen + ", Năm sinh: " + sv.namSinh + ", SDT: " + sv.sdt);
	}
}
