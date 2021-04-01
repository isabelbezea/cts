package ro.ase.cts.builder;

public class Rezervare {

	private  int codRezervare;
	private   boolean areMancareInclusa;
	private boolean  areScaunErgonomic;
	private  boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPErsonalizata;
	private String genMuzica;
	
	
	
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic,
			boolean areBauturaRacoritoare, boolean areMuzicaAmbientalaPErsonalizata, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		this.areMuzicaAmbientalaPErsonalizata = areMuzicaAmbientalaPErsonalizata;
		this.genMuzica = genMuzica;
	}
	
	

	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public boolean isAreMancareInclusa() {
		return areMancareInclusa;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public boolean isAreScaunErgonomic() {
		return areScaunErgonomic;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public boolean isAreBauturaRacoritoare() {
		return areBauturaRacoritoare;
	}
	public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
	}
	public boolean isAreMuzicaAmbientalaPErsonalizata() {
		return areMuzicaAmbientalaPErsonalizata;
	}
	public void setAreMuzicaAmbientalaPErsonalizata(boolean areMuzicaAmbientalaPErsonalizata) {
		this.areMuzicaAmbientalaPErsonalizata = areMuzicaAmbientalaPErsonalizata;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", areBauturaRacoritoare=" + areBauturaRacoritoare
				+ ", areMuzicaAmbientalaPErsonalizata=" + areMuzicaAmbientalaPErsonalizata + ", genMuzica=" + genMuzica
				+ "]";
	}
	
	
}
