package baitapgamehanhdong.model;

public class BinhDoan implements Cloneable{
	private String tenBinhDoan;
	private int soLuong;
	private DoiQuan doiQuan;
	
	
	public BinhDoan(String tenBinhDoan, int soLuong, DoiQuan doiQuan) {
		super();
		this.tenBinhDoan = tenBinhDoan;
		this.soLuong = soLuong;
		this.doiQuan = doiQuan;
	}


	public String getTenBinhDoan() {
		return tenBinhDoan;
	}


	public void setTenBinhDoan(String tenBinhDoan) {
		this.tenBinhDoan = tenBinhDoan;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public DoiQuan getDoiQuan() {
		return doiQuan;
	}


	public void setDoiQuan(DoiQuan doiQuan) {
		this.doiQuan = doiQuan;
	}


	@Override
	public String toString() {
		return "BinhDoan [tenBinhDoan=" + tenBinhDoan + ", soLuong=" + soLuong + ", doiQuan=" + doiQuan + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
