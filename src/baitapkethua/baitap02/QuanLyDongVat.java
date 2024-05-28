package baitapkethua.baitap02;

public class QuanLyDongVat {
	public static void main(String[] args) {
		Meo meo = new Meo("Mun", 1);
		System.out.println(meo);
		meo.tiengKeu();
		System.out.println();
		Tho tho = new Tho("Thỏ trắng", 2);
		System.out.println(tho);
		tho.tiengKeu();
		
	}
	
}
