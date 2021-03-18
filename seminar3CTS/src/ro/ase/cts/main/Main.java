package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager=DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager=DepartamentFinanciarEager.getInstance();
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
	
	primulDepartamentFinanciarEager.setDirector("Gigel");
	alDoileaDepartamentFinanciarEager.setNrAngajati(20);
	

	
	System.out.println(primulDepartamentFinanciarEager.toString());
	System.out.println(alDoileaDepartamentFinanciarEager.toString());
	
	System.out.println("-------");
	
	
	DepartamentFinanciar primulDepartamentFinanciar=DepartamentFinanciar.getInstance(20, "Popescu", 2500);
	DepartamentFinanciar  alDoileaDepartamentFinanciar=DepartamentFinanciar.getInstance(90, "Avramescu", 2800);
	
	System.out.println(primulDepartamentFinanciar.toString());
	System.out.println(alDoileaDepartamentFinanciar.toString());
	}
}
