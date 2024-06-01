package bai06.vidu1;

public class HinhChuNhat implements HinhHoc {
	private double chieuRong;
	private double chieuDai;
	
	
	public HinhChuNhat(double chieuRong, double chieuDai) {
		super();
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}
	
	

	public double getChieuRong() {
		return chieuRong;
	}



	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}



	public double getChieuDai() {
		return chieuDai;
	}



	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	


	@Override
	public String toString() {
		return "HinhChuNhat [chieuRong=" + chieuRong + ", chieuDai=" + chieuDai + "]";
	}



	@Override
	public double tinhChuVi() {
		return 2 * (this.chieuDai * this.chieuRong);
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuDai * this.chieuRong;
	}

}
