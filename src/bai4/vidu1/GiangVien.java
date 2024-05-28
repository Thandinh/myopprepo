package bai4.vidu1;

public class GiangVien extends Nguoi{
	private String maGV;
	private String trinhDo;
	private String chuyenNganh;
	
	public GiangVien(String hoTen, int namSinh, String maGV, String trinhDo, String chuyenNganh) {
		super(hoTen, namSinh);
		this.setMaGV(maGV);
		this.setTrinhDo(trinhDo);
		this.setChuyenNganh(chuyenNganh);
		
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public String toString() {
		return "GiangVien [maGV=" + maGV + ", trinhDo=" + trinhDo + ", chuyenNganh=" + chuyenNganh + ", toString()="
				+ super.toString() + "]";
	}

		
	

}
