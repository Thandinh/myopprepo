package baitapkethua.baitap01;

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
		int soKiTu = maGV.length();
		if(soKiTu == 10) {
			this.maGV = maGV;
		}else {
			System.out.println("Mã giảng viên Không hợp lệ");
		}
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
		if(maGV == null) {
			return "GiangVien: " + super.toString() +  ", trinhDo=" + trinhDo + ", chuyenNganh=" + chuyenNganh + "]";
		}else {
			return "GiangVien [maGV=" + maGV + ", trinhDo=" + trinhDo + ", chuyenNganh=" + chuyenNganh + ", " + super.toString() + "]";
		}
	}

		
	

}
