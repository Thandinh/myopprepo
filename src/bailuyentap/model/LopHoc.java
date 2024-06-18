package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String tenlop;
	private List<SinhVien> dssv;

	public LopHoc(String tenlop, List<SinhVien> dssv) {
		super();
		this.tenlop = tenlop;
		this.dssv = dssv;
	}
	
	
	
	public LopHoc(String tenlop) {
		super();
		this.tenlop = tenlop;
		this.dssv = new ArrayList<SinhVien>();
	}

	public void addSinhVien(SinhVien sv) {
		this.dssv.add(sv);
	}

	
	public String getTenlop() {
		return tenlop;
	}
	
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	public List<SinhVien> getDssv() {
		return dssv;
	}
	
	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
	@Override
	public String toString() {
		return "LopHoc [tenlop=" + tenlop + ", dssv=" + dssv + "]";
	}
}
