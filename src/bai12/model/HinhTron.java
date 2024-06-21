package bai12.model;

public class HinhTron extends HinhHoc {
	private double banKinh;
	
	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banKinh;
	}
	
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}

	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + "]";
	}
	
	

}
