package baitapgamehanhdong.model;

public abstract class VuKhi implements Cloneable{
	
	public abstract void hanhDongVuKhi();
	public abstract void sucManhVuKhi();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
