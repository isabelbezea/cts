package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends AplicantReader {
	public AngajatReader(String numeFisier) {
		super(numeFisier);
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		
		while (input2.hasNext()) {
			Angajat a = new Angajat();
			super.readAplicant(input2, a);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			
			a.setSalariu(salariu);
			a.setOcupatie(ocupatie);
			
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}
}
