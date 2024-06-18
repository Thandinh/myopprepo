package bailuyentap.model;

public class SinhVien {
	private String hoTen;
	private	LopHoc lop;
	private HoaDon hoaDon;
	
	public SinhVien(String hoTen, LopHoc lop, HoaDon hoaDon) {
		super();
		this.setHoTen(hoTen);
		this.setLop(lop);
		this.hoaDon = hoaDon;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LopHoc getLop() {
		return lop;
	}

	public void setLop(LopHoc lop) {
		this.lop = lop;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", lop=" + lop + ", hoaDon=" + hoaDon + "]";
	}
	
	
	
}
