package bailuyentap.model;

public class SanPham implements Cloneable{
	private int maSanPham;
	private String tenSanPham;
	private int soLuong;
	private double giaCa;
	
	
	public SanPham(int maSanPham, String tenSanPham, int soLuong, double giaCa) {
		super();
		this.setMaSanPham(maSanPham);
		this.setTenSanPham(tenSanPham);
		this.setSoLuong(soLuong);
		this.setGiaCa(giaCa);
	}
	
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	
	public String getTenSanPham() {
		return tenSanPham;
	}
	
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double getGiaCa() {
		return giaCa;
	}
	
	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaCa="
				+ giaCa + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
