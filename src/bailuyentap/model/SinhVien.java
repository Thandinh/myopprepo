package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class SinhVien {
	private String hoTen;
	private LopHoc lop;
	private List<HoaDon> dshd;
	
	public SinhVien(String hoTen, LopHoc lop) {
		super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.dshd = new ArrayList<HoaDon>();
	}
	
	public void addHoaDon(HoaDon hd) {
		this.dshd.add(hd);
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

	public List<HoaDon> getHoaDon(){
		return this.dshd;
	}

	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", lop=" + lop + ", dshd=" + dshd + "]";
	}
	
	
}
