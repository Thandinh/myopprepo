package bailuyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bailuyentap.model.BanhXe;
import bailuyentap.model.DongCo;
import bailuyentap.model.HoaDon;
import bailuyentap.model.Laptop;
import bailuyentap.model.LopHoc;
import bailuyentap.model.SanPham;
import bailuyentap.model.SinhVien;
import bailuyentap.model.XeHoi;

public class ChuongTrinh {
	public static void main(String[] args) throws CloneNotSupportedException {
		DongCo dc_xang = new DongCo("Dong co Xang", 2.5);
		DongCo dc_dien = new DongCo("Dong co dien", 2.0);
		BanhXe bx = new BanhXe("Kim Loai", 1.5);
		
		XeHoi xe1 = new XeHoi(1, "VinFast", 3, 30000, dc_dien);
		XeHoi xe2 = new XeHoi(2, "Toyota Camry", 2, 28000, dc_xang);
		XeHoi xe3 = new XeHoi(3, "Mazda CX5", 4, 35000, dc_xang);
		XeHoi xe4 = new XeHoi(4, "Tesla", 1, 5000, dc_dien);
		XeHoi xe5 = new XeHoi(5, "Cadillac", 3, 45000, dc_xang);
		
		for(int i = 0; i < 4; i++) {
			xe1.addBanhXe(bx);
			xe2.addBanhXe(bx);
			xe3.addBanhXe(bx);
			xe4.addBanhXe(bx);
			xe5.addBanhXe(bx);
		}
		
//		a. Tạo một danh sách (List) kiểu XeHoi chứa tối thiểu 5 đối tượng
		List<XeHoi> car = new ArrayList<XeHoi>();
		car.add(xe1);
		car.add(xe2);
		car.add(xe3);
		car.add(xe4);
		car.add(xe5);
		
		
		Laptop lt1 = new Laptop(6, "Asus ROG Zephyrus G14", 2, 2800, 16, "AMD Ryzen 9 5900HS");
		Laptop lt2 = new Laptop(7, "Acer Nitro 5", 1, 1800, 8, "Intel Core i5-11400H");
		Laptop lt3 = new Laptop(8, "Dell XPS 13 Plus", 3, 3800, 16, "Intel Core i7-1260P");
		Laptop lt4 = new Laptop(9, "Lenovo Legion 5", 1, 1800, 12, "AMD Ryzen 7 5800H");
		Laptop lt5 = new Laptop(10, "HP Spectre x360 14", 2, 4500, 32, "Intel Core i7-12700H"); 
		Laptop lt6 = new Laptop(11, "HMacBook Pro 14", 1, 2700, 16, "Apple M1 Pro");
		Laptop lt7 = new Laptop(12, "Microsoft Surface Laptop Studio", 1, 2600, 28, "Intel Core i7-1137G7");
		
//		b. Tạo một danh sách (List<Laptop>) chứa tối thiểu 7 đối tượng
		List<Laptop> lt = new ArrayList<Laptop>();
		lt.add(lt1);
		lt.add(lt2);
		lt.add(lt3);
		lt.add(lt4);
		lt.add(lt5);
		lt.add(lt6);
		lt.add(lt7);
		
		HoaDon hd1 = new HoaDon(1);
		hd1.addSanPham(xe1);
		hd1.addSanPham(xe3);
		hd1.addSanPham(lt7);
		hd1.addSanPham(xe5);
		hd1.addSanPham(lt1);
		
		HoaDon hd2 = new HoaDon(2);
		hd2.addSanPham(xe5);
		hd2.addSanPham(xe4);
		hd2.addSanPham(xe5);
		hd2.addSanPham(lt4);
		hd2.addSanPham(lt6);
		
//		c. Tạo 2 đối tượng kiểu SinhVien, mỗi đối tượng có 1 HoaDon chứa tối thiểu 5
//		SanPham
		SinhVien sv1 = new SinhVien("Nguyen Van A", new LopHoc("K19 CNTT"), hd1);
		SinhVien sv2 = new SinhVien("Phan Van B", new LopHoc("K21 CNTT"), hd2);
		
		
//		d. Tiến hành sắp xếp danh sách List<XeHoi> theo giaxe
		Collections.sort(car, new Comparator<XeHoi>() {

			@Override
			public int compare(XeHoi o1, XeHoi o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGiaCa(), o2.getGiaCa());
			}
			
		});
		
		System.out.println("Sap xep theo gia xe");
		for(XeHoi item: car) {
			System.out.println(item);
		}
		
		
		Collections.sort(lt, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getRam(), o2.getRam());
			}
			
		});
		
		System.out.println("sap xep theo ram laptop");
		for(Laptop item: lt) {
			System.out.println(item);
		}
		
		
		
		
	}
}
