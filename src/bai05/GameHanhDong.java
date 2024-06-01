package bai05;

import bai05.baitap.KyBinh;

public class GameHanhDong {
	public static void main(String[] args) {
		KyBinh kb = new KyBinh("Hecarim", "IT12345", (byte)1, 10, true, false, false, false);
		kb.hanhDong();
		kb.sucManh();
	}
}
