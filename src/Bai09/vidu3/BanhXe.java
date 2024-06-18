package Bai09.vidu3;

public class BanhXe implements Cloneable{
	private double banKinh;

	public BanhXe(double banKinh) {
		super();
		this.setBanKinh(banKinh);;
	}


	public double getBanKinh() {
		return banKinh;
	}


	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public String toString() {
		return "BanhXe [banKinh=" + banKinh + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
