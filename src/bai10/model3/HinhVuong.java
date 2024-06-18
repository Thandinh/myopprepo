package bai10.model3;

public class HinhVuong extends HinhHoc {
	private double canh;
	

	
	public HinhVuong(double canh) {
		super();
		this.canh = canh;
	}



	public double getCanh() {
		return canh;
	}


	public void setCanh(double canh) {
		this.canh = canh;
	}

	

	@Override
	public String toString() {
		return "HinhVuong [canh=" + canh + ", tinhDienTich()=" + tinhDienTich() + "]";
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.canh * this.canh;
	}

}
