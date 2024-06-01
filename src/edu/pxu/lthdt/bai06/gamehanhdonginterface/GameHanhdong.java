package edu.pxu.lthdt.bai06.gamehanhdonginterface;

import edu.pxu.lthdt.bai06.KyBinh;
import edu.pxu.lthdt.bai06.PhuThuy;

public class GameHanhdong {

	public static void main(String[] args) {
		KyBinh kb = new KyBinh("Hecarim", "IT12345", (byte)1, 10, true, false, false, false);
		System.out.println(kb);
		kb.hanhDong();
		kb.sucManh();
		kb.tanCongCoVuKhi();
		kb.boChay();
	}

}
