package bailuyentap.model;

public class BanhXe implements Cloneable{
	private String loaiBanhXe;
	private double banKinh;
	
	
	
	public BanhXe(String loaiBanhXe, double banKinh) {
		super();
		this.setLoaiBanhXe(loaiBanhXe);
		this.setBanKinh(banKinh);
	}

	public String getLoaiBanhXe() {
		return loaiBanhXe;
	}
	
	public void setLoaiBanhXe(String loaiBanhXe) {
		this.loaiBanhXe = loaiBanhXe;
	}
	
	public double getBanKinh() {
		return banKinh;
	}
	
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public String toString() {
		return "BanhXe [loaiBanhXe=" + loaiBanhXe + ", banKinh=" + banKinh + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
