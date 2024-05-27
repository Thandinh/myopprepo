package edu.pxu.lthdt.bai03;


public class QuanLyXe {
	public static void main(String[] args) {
		XeOTo oto = new XeOTo("Xe 1", 2015, 1000);
		XeBus bus = new XeBus("Xe 2", 2010, 2000, 30);
		System.out.println(oto);
		System.out.println(bus);
	}
}
