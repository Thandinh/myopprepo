package Bai09.vidu3;

import java.util.ArrayList;

public class XeHoi {
	private DongCo loaiDongCo;
	private ArrayList<BanhXe> dsbx;
	
	public XeHoi(DongCo loaiDongCo, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
		super();
		this.setLoaiDongCo((DongCo)loaiDongCo.clone());;
		this.dsbx = dsbx;
	}
	
	public XeHoi(DongCo loaiDongCo) throws CloneNotSupportedException {
		this.setLoaiDongCo((DongCo)loaiDongCo.clone());
		this.dsbx = new ArrayList<BanhXe>();
	}
	
	public void addBanhXe(BanhXe bx) {
		this.dsbx.add(bx);
	}

	public DongCo getLoaiDongCo() {
		return loaiDongCo;
	}

	public void setLoaiDongCo(DongCo loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}

	public ArrayList<BanhXe> getDsbx() {
		return dsbx;
	}

	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}

	@Override
	public String toString() {
		return "XeHoi [loaiDongCo=" + loaiDongCo + ", dsbx=" + dsbx + "]";
	}
	
	
	
}
