package ro.ase.cts.facade;

public class BirouCredite {
	public static Boolean areCredite(Persoana p) {
		int cifra=Integer.parseInt(""+p.getCnp().charAt(9));
		
		return cifra%2==0;
	}
		
}


