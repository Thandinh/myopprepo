package baitapgamehanhdong.model;

public class NhanVat extends VuKhi implements DiChuyen{
	private String ten;
	private String id;
	private byte gioiTinh;
	private double nangLuong;

	
	public NhanVat(String ten, String id, byte gioiTinh, double nangLuong) {
	
		this.setTen(ten);
		this.setId(id);
		this.setGioiTinh(gioiTinh);
		this.setNangLuong(nangLuong);
		
	}
	

	
	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public byte getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(byte gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public double getNangLuong() {
		return nangLuong;
	}


	public void setNangLuong(double nangLuong) {
		this.nangLuong = nangLuong;
	}


	


	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + "]";
	}




	@Override
	public void nhanVatdiChuyen() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hanhDongVuKhi() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sucManhVuKhi() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
