package bai08.vidu5;

import java.util.ArrayList;

public class HoaDon implements Cloneable{
	private int maHoaDon;
	private ArrayList<SanPham> dssp;
	
	public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
		this.setMaHoaDon(maHoaDon);
		this.dssp = dssp;
	}
	
	public int getMaHoaDon() {
		return this.maHoaDon;
	}
	
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	
	public ArrayList<SanPham> getDssp(){
		return this.dssp;
	}
	
	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", dssp=" + dssp + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ArrayList<SanPham> dsspMoi = new ArrayList<SanPham>();
		for(SanPham item: this.dssp) {
			SanPham tam = new SanPham(item.getMaSP(), item.getTenSP());
			dsspMoi.add(tam);
		}
		HoaDon kq = new HoaDon(this.maHoaDon, dsspMoi);
		return kq;
	}
	
	
	

}
