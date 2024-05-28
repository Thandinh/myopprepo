package edu.pxu.lthdt.bai03;
import java.time.LocalDate;

public class XeBus {
	private String hangXe;
	private int namSX;
	private float dongCo;
	private int soGhe;
	
	public XeBus(String hangXe, int namSX, float dongCo, int soGhe) {
		this.hangXe = hangXe;
		this.setNamSX(namSX);
		this.dongCo = dongCo;
		this.setSoGhe(soGhe);
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
		if(namSX < 1885 || namSX >= ngayHT) {
			System.out.println("Nhập sai dữ liệu");
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
	
	public int getSoGhe() {
		return this.soGhe;
	}
	
	public void setSoGhe(int soGhe) {
		if(soGhe <= 10 || soGhe >= 200) {
			System.out.println("Nhập sai dữ liệu");
		}else {
			this.soGhe = soGhe;
		}
	}

	@Override
	public String toString() {
	        if(namSX == 0 || dongCo ==0 || soGhe==0){
	            return "Xe Bus{" + "hang xe=" + hangXe + '}'; 
	        }else if(namSX == 0){
	            return "Xe Bus{" + "hang xe=" + hangXe + ", dong co=" + dongCo + ", so ghe=" + soGhe + '}';
	        }else if (dongCo==0){
	            return "Xe Bus{" + "hang xe=" + hangXe + ", nam san xuat=" + namSX + ", so ghe=" + soGhe + '}';
	        }
	        else if(soGhe==0){
	            return "Xe Bus{" + "hang xe=" + hangXe + ", nam san xuat=" + namSX + ", dong co=" + dongCo + '}';
	        }else {
	            return "Xe Bus{" + "hang xe=" + hangXe + ", nam san xuat=" + namSX + ", dong co=" + dongCo + ", so ghe=" + soGhe + '}';
	        }
	}
	
	
}
