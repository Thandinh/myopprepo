package edu.pxu.lthdt.bai05.gamehanhdong;

import edu.pxu.lthdt.bai05.KyBinh;

public class GameHanhDong {

	public static void main(String[] args) {
		KyBinh kb = new KyBinh("Hecarim", "IT12345", (byte)1, 10, true, false, false, false);
		System.out.println(kb);
		kb.hanhDong();
		kb.sucManh();
	}

}
