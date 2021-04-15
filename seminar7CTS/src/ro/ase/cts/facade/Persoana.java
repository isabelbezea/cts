package ro.ase.cts.facade;

import java.time.LocalDate;

public class Persoana {

	private String nume;
	private String cnp;
	
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", cnp=" + cnp + "]";
	}
	//an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public  int calculeazaVarsta() {
		  return LocalDate.now().getYear()-(1900 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
	}
}
