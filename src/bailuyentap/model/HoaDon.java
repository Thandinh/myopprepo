package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
	private int soHoaDon;
	private List<SanPham> dssp;
	
	
	
	public HoaDon(int soHoaDon) {
		super();
		this.setSoHoaDon(soHoaDon);;
		this.dssp = new ArrayList<SanPham>();
	}
	
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		this.dssp.add((SanPham)sp.clone());
	}

	public int getSoHoaDon() {
		return soHoaDon;
	}
	
	public void setSoHoaDon(int soHoaDon) {
		this.soHoaDon = soHoaDon;
	}
	
	public List<SanPham> getDssp() {
		return dssp;
	}
	
	public void setDssp(List<SanPham> dssp) {
		for(SanPham item: dssp) {
			this.dssp.add(item);
		}
	}

	@Override
	public String toString() {
		return "HoaDon [soHoaDon=" + soHoaDon + ", dssp=" + dssp + "]";
	}
	
	
	
	
}
