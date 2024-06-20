package bailuyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bailuyentap.model.BanhXe;
import bailuyentap.model.DongCo;
import bailuyentap.model.HoaDon;
import bailuyentap.model.Laptop;
import bailuyentap.model.LopHoc;
import bailuyentap.model.SanPham;
import bailuyentap.model.SinhVien;
import bailuyentap.model.XeHoi;

public class QuanLySanPham {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<XeHoi> cars = new ArrayList<XeHoi>();
		XeHoi car1 = new XeHoi(1, "Toyota", 2, 1000, new DongCo("Dong co xang", 140));
		car1.addBanhXe(new BanhXe("Caosu", 1.5));
		car1.addBanhXe(new BanhXe("Caosu", 1.5));
		car1.addBanhXe(new BanhXe("Caosu", 1.5));
		car1.addBanhXe(new BanhXe("Caosu", 1.5));
		cars.add(car1);
		XeHoi car2 = new XeHoi(2, "Vinfast", 1, 1500, new DongCo("Dong co dien", 140));
		car2.addBanhXe(new BanhXe("Caosu", 1.5));
		car2.addBanhXe(new BanhXe("Caosu", 1.5));
		car2.addBanhXe(new BanhXe("Caosu", 1.5));
		car2.addBanhXe(new BanhXe("Caosu", 1.5));
		cars.add(car2);
		XeHoi car3 = new XeHoi(3, "Lambo", 2, 1200, new DongCo("Dong co xang", 140));
		car3.addBanhXe(new BanhXe("Caosu", 1.5));
		car3.addBanhXe(new BanhXe("Caosu", 1.5));
		car3.addBanhXe(new BanhXe("Caosu", 1.5));
		car3.addBanhXe(new BanhXe("Caosu", 1.5));
		cars.add(car3);
		XeHoi car4 = new XeHoi(4, "Tesla", 1, 2500, new DongCo("Dong co dien", 140));
		car4.addBanhXe(new BanhXe("Caosu", 1.5));
		car4.addBanhXe(new BanhXe("Caosu", 1.5));
		car4.addBanhXe(new BanhXe("Caosu", 1.5));
		car4.addBanhXe(new BanhXe("Caosu", 1.5));
		cars.add(car4);
		XeHoi car5 = new XeHoi(4, "Audi", 1, 1900, new DongCo("Dong co xang", 140));
		car5.addBanhXe(new BanhXe("Caosu", 1.5));
		car5.addBanhXe(new BanhXe("Caosu", 1.5));
		car5.addBanhXe(new BanhXe("Caosu", 1.5));
		car5.addBanhXe(new BanhXe("Caosu", 1.5));
		cars.add(car5);
		System.out.println("Danh sach xe hoi");
		for(XeHoi item: cars) {
			System.out.println(item);
		}
		
		List<Laptop> lts = new ArrayList<Laptop>();
		lts.add(new Laptop(1, "Dell", 1, 1500, 15, "i7"));
		lts.add(new Laptop(2, "MSI", 1, 1700, 32, "i9"));
		lts.add(new Laptop(3, "Lenovo", 1, 1500, 16, "i7"));
		lts.add(new Laptop(4, "Mac Air 3", 1, 1800, 16, "i7"));
		lts.add(new Laptop(5, "HP", 1, 1500, 16, "i7"));
		lts.add(new Laptop(6, "ROG", 1, 2800, 16, "i9"));
		lts.add(new Laptop(7, "Asus", 1, 2500, 16, "i7"));
		for(Laptop item: lts) {
			System.out.println(item);
		}
		
		List<SanPham> listSanPham = new ArrayList<SanPham>();
		listSanPham.add(new Laptop(123, "Mac", 5, 1500, 365,"i7"));
		listSanPham.add(car5);
		listSanPham.add(new Laptop(234, "Win", 5, 1500, 365,"i7"));
		listSanPham.add(car4);
		listSanPham.add(new Laptop(357, "Dell", 5, 1500, 365,"i7"));
		HoaDon hd = new HoaDon(123);
		hd.setDssp(listSanPham);
		
		System.out.println(hd);
		
		SinhVien sv = new SinhVien("Nguyen Van A", new LopHoc("CNTT"));
		sv.addHoaDon(hd);
		System.out.println(sv);
		
		Collections.sort(cars, new Comparator<XeHoi>() {

			@Override
			public int compare(XeHoi o1, XeHoi o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGiaCa(), o2.getGiaCa());
			}
			
		});
		for(SanPham item: cars) {
			System.out.println(item);
		}
		
		Collections.sort(lts, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getRam(), o2.getRam());
			}
			
		});
		
		for(SanPham item: lts) {
			System.out.println(item);
		}
		
		List<SanPham> dssp = sv.getHoaDon().get(0).getDssp();
		SanPham tam = Collections.max(dssp, new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGiaCa(), o2.getGiaCa());
			}
			
		});
		
		System.out.println(tam);
		
		Predicate<SanPham> dk_tk = new Predicate<SanPham>() {
			
			@Override
			public boolean test(SanPham t) {
				// TODO Auto-generated method stub
				return t.getGiaCa() >= 1000 && t.getSoLuong() <= 5;
			}
		};
		
		List<SanPham> dskq = dssp.stream()
				.filter(dk_tk)
				.toList();
		System.out.println("Danh sach tiem kiem");
		for(SanPham item: dskq) {
			System.out.println(item);
		}
	}

}
