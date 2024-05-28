package baitapkethua.baitap01;

public class SinhVien extends Nguoi{
	private String maSV;
	private String nganhHoc;
	public SinhVien(String hoTen, int namSinh, String maSV, String nganhHoc) {
		super(hoTen, namSinh);
		this.setMaSV(maSV);
		this.setNganhHoc(nganhHoc);
	}
	
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		int soKiTu = maSV.length();
		if(soKiTu == 10) {
			this.maSV = maSV;
		}else {
			System.out.println("Mã sinh viên Không hợp lệ");
		}	
	}
	
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}


	@Override
	public String toString() {
		if(this.maSV == null) {
			return "SinhVien: " + super.toString() + ", nganhHoc=" + nganhHoc + "]";
		}
		return "SinhVien [maSV=" + maSV + ", nganhHoc=" + nganhHoc + "]" + super.toString();
	}
	
	


	


	
	
	
	
	

}
