package baitapkethua.baitap02;

public class DongVat {
	private String tenDongVat;
	private int tuoi;
	
	public DongVat(String ten, int tuoi) {
		this.setTenDongVat(ten);
		this.setTuoi(tuoi);
	}

	public String getTenDongVat() {
		return tenDongVat;
	}

	public void setTenDongVat(String tenDongVat) {
		this.tenDongVat = tenDongVat;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		if(this.tuoi < 0 || this.tuoi > 99) {
			System.out.println("Dữ liệu không hợp lệ");
		}else {
			this.tuoi = tuoi;
		}
	}

	@Override
	public String toString() {
		if(tuoi == 0) {
			return "DongVat [tenDongVat=" + tenDongVat + "]";
		}
		else {
			return "DongVat [tenDongVat=" + tenDongVat + ", tuoi=" + tuoi + "]";
		}
		
	}
	
	
	
}
