package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervari;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operator1= new OperatorRezervari();
		
		operator1.realizaeazaRezervare(2);
		
		ProxyOperatorRezervari proxyOperatorRezervari=new ProxyOperatorRezervari(operator1, 4);

		proxyOperatorRezervari.realizaeazaRezervare(2);
	}

}
