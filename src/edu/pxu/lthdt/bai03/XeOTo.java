package edu.pxu.lthdt.bai03;
import java.time.LocalDate;

public class XeOTo {
	private String hangXe;
	private int namSX;
	private float dongCo;
	
	public XeOTo(String hangXe, int namSX, float dongCo) {
		this.hangXe = hangXe;
		this.setNamSX(namSX);
		this.dongCo = dongCo;
		
	}
	
	public String getHangXe() {
		return this.hangXe;
	}
	
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	
	public int getNamSX() {
		return this.namSX;
	}
	
	public void setNamSX(int namSX) {
		LocalDate ngayHienTai = LocalDate.now();
		int ngayHT = ngayHienTai.getYear();
		if(namSX < 1885 || namSX > ngayHT) {
			System.out.println("Bạn đã nhập sai dữ liệu");
		}else {
			this.namSX = namSX;
		}
	}
	
	public float getDongCo() {
		return this.dongCo;
	}
	
	public void setDongCo(float dongCo) {
		this.dongCo = dongCo;
	}

	@Override
	public String toString() {
		if(namSX == 0 || dongCo ==0){
            return "Xe Bus{" + "hang xe=" + hangXe + '}'; 
        }else if(namSX == 0){
            return "Xe Bus{" + "hang xe=" + hangXe + ", dong co=" + dongCo + '}';
        }else if (dongCo==0){
            return "Xe Bus{" + "hang xe=" + hangXe + ", nam san xuat=" + namSX +'}';
        }else {
            return "Xe Bus{" + "hang xe=" + hangXe + ", nam san xuat=" + namSX + ", dong co=" + dongCo + '}';
        }
	}
	
	
	
}
