package ro.ase.cts.facade;

public class Facade {

	public static Boolean esteAptaPersoana(Persoana persoana) {

		if(persoana.calculeazaVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	
	}
}
