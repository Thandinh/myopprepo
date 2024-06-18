package Bai09.vidu2;

import java.util.ArrayList;

public class HoaDon {
	private int maHoaDon;
	private ArrayList<SanPham> dssp;
	
	
	public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
		super();
		this.setMaHoaDon(maHoaDon);
		this.setDssp(dssp);;
	}

	public HoaDon(int maHoaDon) {
		this.setMaHoaDon(maHoaDon);
		this.dssp = new ArrayList<SanPham>();
	}
	
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		SanPham tmp = (SanPham) sp.clone();
		this.dssp.add(tmp);
	}
	
	public int getMaHoaDon() {
		return maHoaDon;
	}


	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}


	public ArrayList<SanPham> getDssp() {
		return dssp;
	}


	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}


	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", dssp=" + dssp + "]";
	}
	
	
	
}
