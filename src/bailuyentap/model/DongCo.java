package bailuyentap.model;

public class DongCo implements Cloneable{
	private String loaiDongCo;
	private double congSuat;
	
	
	
	public DongCo(String loaiDongCo, double congSuat) {
		super();
		this.setLoaiDongCo(loaiDongCo);
		this.setCongSuat(congSuat);
	}

	public String getLoaiDongCo() {
		return loaiDongCo;
	}
	
	public void setLoaiDongCo(String loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}
	
	public double getCongSuat() {
		return congSuat;
	}
	
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String toString() {
		return "DongCo [loaiDongCo=" + loaiDongCo + ", congSuat=" + congSuat + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
