package ro.ase.cts.facade.clase;

public class GestionarMese {

	public boolean esteMasaLibera(int cod) {
		if(cod%2==0) {
			return true;
		}
		return false;
	}
	
}
