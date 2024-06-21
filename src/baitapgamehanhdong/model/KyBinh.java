package baitapgamehanhdong.model;

import java.util.ArrayList;
import java.util.List;

public class KyBinh extends NhanVat {
	

	private boolean kiem;
	private boolean cung;
	private boolean ngua;
	private List<BinhDoan> dsbd;
	
	public KyBinh(String ten, String id, byte gioiTinh, double nangLuong, boolean kiem, boolean cung, boolean ngua) {
		super(ten, id, gioiTinh, nangLuong);
		this.setKiem(kiem);
		this.setCung(cung);
		this.setNgua(ngua);
		this.dsbd = new ArrayList<BinhDoan>();
	}
	
	public void addBinhDoan(BinhDoan bd) throws CloneNotSupportedException {
		this.dsbd.add((BinhDoan)bd.clone());
	}

	public boolean isKiem() {
		return kiem;
	}

	public void setKiem(boolean kiem) {
		this.kiem = kiem;
	}

	public boolean isCung() {
		return cung;
	}

	public void setCung(boolean cung) {
		this.cung = cung;
	}

	public boolean isNgua() {
		return ngua;
	}

	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}

	public List<BinhDoan> getDsbd() {
		return dsbd;
	}

	public void setDsbd(List<BinhDoan> dsbd) {
		for(BinhDoan item: dsbd) {
			this.dsbd.add(item);
		}
	}

	@Override
	public String toString() {
		return "KyBinh [kiem=" + kiem + ", cung=" + cung + ", ngua=" + ngua + ", dsbd=" + dsbd + ", getTen()="
				+ getTen() + ", getId()=" + getId() + ", getGioiTinh()=" + getGioiTinh() + ", getNangLuong()="
				+ getNangLuong() + "]";
	}
	
	public void nhanVatdiChuyen() {
		System.out.println("Cưỡi ngựa");
		
	}
	
	public void hanhDongVuKhi() {
		System.out.println("Vừa cưỡi ngựa vừa cầm kiếm chém");
	}
	
	public void sucManhVuKhi() {
		double energy = this.getNangLuong() * 2;
		System.out.println("Sức mạnh vũ khí của Kỵ binh là: " + energy);
		
	}
	
	
	
}
