package bai4.vidu2;

public class QuanLyChaCon {

	public static void main(String[] args) {
		LopCha obj1 = new LopCha("Lop Cha", 15, 3.1417);
		obj1.thuocTinh2 = 10;
		obj1.thuocTinh3 = 7.5;
		System.out.println(obj1);
		obj1.phuongthuc2();
		obj1.phuongthuc3();
		obj1.vidugoiprivate();
		System.out.println(obj1);
		
		LopCon obj2 = new LopCon("Nguyễn Văn A", 100, 9.9, "k21 cntt");
		obj2.phuongthuc2();

	}

}
