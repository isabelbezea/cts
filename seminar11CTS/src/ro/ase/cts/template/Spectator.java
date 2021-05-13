package ro.ase.cts.template;

public class Spectator extends SpectatorAbstract {

	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul "+ nume+" s-a asezat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul "+ nume+" a prezentat biletul");
		
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul "+ nume+" a realizat control corporal");
		
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println("Spectatorul "+ nume+" a intrat pe stadion");
		
		
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+ nume+" a ocupat loc");
		
		
	}
	
	
}
