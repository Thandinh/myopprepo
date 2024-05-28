package baitapkethua.baitap01;

public class QuanLyNhanSu {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("Nguyễn Văn A", 2999, "ITABC0112T", "CNTT");
		System.out.println(sv);
		SinhVien sv2 = new SinhVien("Nguyễn Văn A", 2999, "ITABC0a112T", "CNTT");
		System.out.println(sv2);
		GiangVien gv = new GiangVien("Phan Văn B", 1988, "ITGV123", "Tiến sĩ", "Công nghệ thông tin");
		System.out.println(gv);
	}
}
