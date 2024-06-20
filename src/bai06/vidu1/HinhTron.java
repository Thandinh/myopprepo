package bai06.vidu1;

public class HinhTron implements HinhHoc{
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
	
	



	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + "]";
	}



	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.banKinh;
	}



	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * this.banKinh * this.banKinh;
	}

	

}
