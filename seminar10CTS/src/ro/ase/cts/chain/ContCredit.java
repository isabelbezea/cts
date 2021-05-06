package ro.ase.cts.chain;

public class ContCredit extends Handler {

	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata  cu suma de "+suma +" din contul de  credit");
		}
		else { 
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
