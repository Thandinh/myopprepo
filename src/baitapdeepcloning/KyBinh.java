package baitapdeepcloning;

import java.util.ArrayList;

import bai08.vidu4.SanPham;

public class KyBinh implements Cloneable{
	private int maKyBinh;
	private ArrayList<VuKhi> dsvk;
	
	
	public KyBinh(int maKyBinh, ArrayList<VuKhi> dsvk) {
		this.maKyBinh = maKyBinh;
		this.dsvk = dsvk;
	}


	public int getMaKyBinh() {
		return maKyBinh;
	}


	public void setMaKyBinh(int maKyBinh) {
		this.maKyBinh = maKyBinh;
	}


	public ArrayList<VuKhi> getDsvk() {
		return dsvk;
	}


	public void setDsvk(ArrayList<VuKhi> dsvk) {
		this.dsvk = dsvk;
	}


	@Override
	public String toString() {
		return "KyBinh [maKyBinh=" + maKyBinh + ", dsvk=" + dsvk + "]";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		ArrayList<VuKhi> dsvkmoi = new ArrayList<VuKhi>();
		for(VuKhi item: this.dsvk) {
			VuKhi tam = new VuKhi(item.getVuKhi(), item.getSoLuong());
			dsvkmoi.add(tam);
		}
		KyBinh kq = new KyBinh(this.maKyBinh, dsvkmoi);
		return kq;
	}
	
	
	
	

}
