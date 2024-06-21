package baitapgamehanhdong.model;

import java.util.ArrayList;
import java.util.List;

public class DoiQuan{
	private String tenDoiQuan;
	private List<BinhDoan> dsbd;
	
	public DoiQuan(String tenDoiQuan) {
		super();
		this.tenDoiQuan = tenDoiQuan;
		this.dsbd = new ArrayList<BinhDoan>();
	}

	public String getTenDoiQuan() {
		return tenDoiQuan;
	}

	public void setTenDoiQuan(String tenDoiQuan) {
		this.tenDoiQuan = tenDoiQuan;
	}

	public List<BinhDoan> getDsbd() {
		return dsbd;
	}

	public void setDsbd(List<BinhDoan> dsbd) {
		this.dsbd = dsbd;
	}

	@Override
	public String toString() {
		return "DoiQuan [tenDoiQuan=" + tenDoiQuan + ", dsbd=" + dsbd + "]";
	}
	
	
	
}
