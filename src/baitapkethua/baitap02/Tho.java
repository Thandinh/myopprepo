package baitapkethua.baitap02;

public class Tho extends DongVat{

	public Tho(String ten, int tuoi) {
		super(ten, tuoi);
	}
	
	public void tiengKeu() {
		System.out.println("Ộp! ộp!");
	}

	@Override
	public String toString() {
		return "Tho " + super.toString();
	}

	
}
