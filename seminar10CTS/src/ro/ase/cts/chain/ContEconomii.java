package ro.ase.cts.chain;

public class ContEconomii extends Handler {

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata  cu suma de "+suma +" din contul de economii");
		}
		else { 
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
