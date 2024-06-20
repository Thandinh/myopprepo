package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham{
	private DongCo dongCo;
	private List<BanhXe> dsbx;
	
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongCo) {
		super(maSanPham, tenSanPham, soLuong, giaCa);
		this.setDongCo(dongCo);
		this.dsbx = new ArrayList<BanhXe>();
	}
	
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		this.dsbx.add((BanhXe)bx.clone());
	}

	public DongCo getDongCo() {
		return dongCo;
	}

	public void setDongCo(DongCo dongCo) {
		this.dongCo = dongCo;
	}

	public List<BanhXe> getDsbx() {
		return dsbx;
	}

	public void setDsbx(List<BanhXe> dsbx) throws CloneNotSupportedException {
		for(BanhXe item: dsbx) {
			this.dsbx.add((BanhXe)item.clone());
		}
	}

	@Override
	public String toString() {
		return "XeHoi [dongCo=" + dongCo + ", dsbx=" + dsbx + ", getMaSanPham()=" + getMaSanPham()
				+ ", getTenSanPham()=" + getTenSanPham() + ", getSoLuong()=" + getSoLuong() + ", getGiaCa()="
				+ getGiaCa() + "]";
	}
	
	
	
	
	
	
	
	
}
