package ro.ase.cts.template;

public class SpectatorVIP extends SpectatorAbstract{

	private  String numeVIP;
	
	public SpectatorVIP(String numeVIP) {
		super();
		this.numeVIP = numeVIP;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVIP +" se prezinta direct la poarta");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVIP +" prezinta bilet VIP");
		
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVIP +" realizeaza control VIP");
		
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVIP +" intra in tribuna VIP");
		
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVIP +" ocupa loc in loja");
		
		
	}

}
