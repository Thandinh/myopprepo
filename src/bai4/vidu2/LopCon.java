package bai4.vidu2;

public class LopCon extends LopCha {
	private String thuocTinhRieng;
	
	public LopCon(String thuocTinh1, int thuocTinh2, double thuocTinh3, String thuocTinhRing) {
		super(thuocTinh1, thuocTinh2, thuocTinh3);
		this.thuocTinhRieng = thuocTinhRieng;
		
	}
	
	public String getThuocTinhRieng() {
		return thuocTinhRieng;
	}
	
	public void setThuocTinhRieng(String thuocTinhRieng) {
		this.thuocTinhRieng = thuocTinhRieng;
	}

	@Override
	public String toString() {
		return "LopCon [thuocTinhRieng=" + thuocTinhRieng + "]";
	}
	
	

}
