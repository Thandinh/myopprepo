package bai4.vidu2;

public class LopCha {
	private String thuocTinh1;
	protected int thuocTinh2;
	public double thuocTinh3;
	
	public LopCha(String thuocTinh1, int thuocTinh2, double thuocTinh3) {
		this.thuocTinh1 = thuocTinh1;
		this.thuocTinh2 = thuocTinh2;
		this.thuocTinh3 = thuocTinh3;
	}
	
	public String getThuocTinh1() {
		return thuocTinh1;
	}
	
	public void setThuocTinh(String thuocTinh1) {
		this.thuocTinh1 = thuocTinh1;
	}
	
	public int getThuocTinh2() {
		return thuocTinh2;
	}
	
	public void setThuocTinh2(int thuocTinh2) {
		this.thuocTinh2 = thuocTinh2;
	}
	
	public double getThuocTinh3() {
		return thuocTinh3;
	}
	
	public void setThuocTinh3(double thuocTinh3) {
		this.thuocTinh3 = thuocTinh3;
	}

	@Override
	public String toString() {
		return "LopCha [thuocTinh=" + thuocTinh1 + ", thuocTinh2=" + thuocTinh2 + ", thuocTinh3=" + thuocTinh3 + "]";
	}
	
	private void phuongthuc1() {
		System.out.println("Đây là phương thức 1 private");
	}
	
	protected void phuongthuc2() {
		System.out.println("Đây là phương thức 2 protected");
	}
	
	public void phuongthuc3() {
		System.out.println("Đây là phương thức 3 public");
	}
	
	public void vidugoiprivate() {
		System.out.println("Truy cập đến thuộc tính và phương thức private");
		this.thuocTinh1 = "Thay doi gia tri";
		this.phuongthuc1();
	}
}
