package ro.ase.cts.adapter.obiecte;

public class Leasing {

	String nume;
	
	public void oferaLeasing() {
		System.out.println("I se ofera leasing lui "+nume);
	}

	public Leasing(String nume) {
		super();
		this.nume = nume;
	}
	
}
