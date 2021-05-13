package ro.ase.cts.observer;

public class Program {

	public static void main(String[] args) {
		Observer c1=new ClientFidel("Gigel");
		Observer c2=new ClientFidel("Cornel");
		Observer c3=new ClientFidel("Marcel");
		Observer c4=new ClientFidel("Viorica");
		
		ManagerSala managerSala=new ManagerSala();
		
		managerSala.adaugaAbonat(c1);
		managerSala.adaugaAbonat(c2);
		managerSala.adaugaAbonat(c3);
		managerSala.adaugaAbonat(c4);
		
		managerSala.anuntaMeci("Fotbal");
		
		managerSala.stergeAbonat(c1);
		managerSala.anuntaMeci("Tenis");
		

	}

}
