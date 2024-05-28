package baitapkethua.baitap02;

public class Meo extends DongVat{

	public Meo(String ten, int tuoi) {
		super(ten, tuoi);
	
	}
	
	public void tiengKeu() {
		System.out.println("Meo! Meo!");
	}

	@Override
	public String toString() {
		return "Meo: " + super.toString();
	}

	
}
