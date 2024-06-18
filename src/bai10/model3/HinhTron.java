package bai10.model3;

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

	
	
	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + ", tinhDienTich()=" + tinhDienTich() + "]";
	}


	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * this.banKinh * this.banKinh;
	}

}
