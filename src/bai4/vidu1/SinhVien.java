package bai4.vidu1;

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
		this.maSV = maSV;
	}
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}


	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", nganhHoc=" + nganhHoc + "]" + super.toString();
	}
	
	


	


	
	
	
	
	

}
