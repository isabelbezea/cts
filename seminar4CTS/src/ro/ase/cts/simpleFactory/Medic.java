package ro.ase.cts.simpleFactory;

public class Medic extends PersonalSpital {

	public Medic(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medic [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
