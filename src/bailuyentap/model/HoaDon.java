package bailuyentap.model;

import java.util.ArrayList;

public class HoaDon {
	private int soHoaDon;
	private ArrayList<SanPham> dssp;
	
	public HoaDon(int soHoaDon, ArrayList<SanPham> dssp) {
		super();
		this.setSoHoaDon(soHoaDon);;
		this.setDssp(dssp);;
	}
	
	public HoaDon(int soHoaDon) {
		this.setSoHoaDon(soHoaDon);
		this.dssp = new ArrayList<SanPham>();
	}
	
	public void addSanPham(SanPham sv) {
		this.dssp.add(sv);
	}

	public int getSoHoaDon() {
		return soHoaDon;
	}

	public void setSoHoaDon(int soHoaDon) {
		this.soHoaDon = soHoaDon;
	}

	public ArrayList<SanPham> getDssp() {
		return dssp;
	}

	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}



	@Override
	public String toString() {
		return "HoaDon [soHoaDon=" + soHoaDon + ", dssp=" + dssp + "]";
	}
	
	
	
}
