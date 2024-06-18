package bailuyentap.model;

import java.util.ArrayList;

public class XeHoi extends SanPham{
	private DongCo dongCo;
	private ArrayList<BanhXe> dsbx;
	
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa,
			DongCo dongCo, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
		super(maSanPham, tenSanPham, soLuong, giaCa);
		this.setDongCo((DongCo)dongCo.clone());
		this.setDsbx(dsbx);
	}
	
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa,
			DongCo dongCo) throws CloneNotSupportedException {
		super(maSanPham, tenSanPham, soLuong, giaCa);
		this.setDongCo((DongCo)dongCo.clone());
		this.dsbx = new ArrayList<BanhXe>();
	}
	
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		BanhXe tam = (BanhXe)bx.clone();
		this.dsbx.add(tam);
	}
	
	

	public DongCo getDongCo() {
		return dongCo;
	}

	public void setDongCo(DongCo dongCo) {
		this.dongCo = dongCo;
	}

	public ArrayList<BanhXe> getDsbx() {
		return dsbx;
	}

	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}

	@Override
	public String toString() {
		return "XeHoi [dongCo=" + dongCo + ", dsbx=" + dsbx + ", getMaSanPham()=" + getMaSanPham()
				+ ", getTenSanPham()=" + getTenSanPham() + ", getSoLuong()=" + getSoLuong() + ", getGiaCa()="
				+ getGiaCa() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	

}
