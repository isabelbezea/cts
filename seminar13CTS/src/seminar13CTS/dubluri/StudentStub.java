package seminar13CTS.dubluri;

import java.util.List;

import seminar13CTS.IStudent;

public class StudentStub  implements IStudent {

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Ionica";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return 9.8f;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return false;
	}

}
