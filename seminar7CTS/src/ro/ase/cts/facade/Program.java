package ro.ase.cts.facade;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persoana persoana=new Persoana("Marco", "2990629569999");
		
		if(persoana.calculeazaVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui "+persoana.getNume());
				}
			}
		}
		Persoana persoana1= new Persoana("Ionela", "2990629569998");
		
		if(Facade.esteAptaPersoana(persoana1)) {
		}
	}

}
