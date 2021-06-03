package seminar13CTS.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import seminar13CTS.Grupa;
import seminar13CTS.categorii.TesteGetPromovabilitate;
import seminar13CTS.dubluri.StudentFake;

public class TestGrupaWithFakeStudent {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateAreRestante() {
		
		Grupa grupa=new Grupa(1077);
		
		for(int i=0;i<8;i++) {
			StudentFake studentFake=new StudentFake();
			studentFake.setAreRestante(false);
			grupa.adaugaStudent(studentFake);
		}
		
		for(int i=0;i<2;i++) {
			StudentFake studentFake=new StudentFake();
			studentFake.setAreRestante(true);
			grupa.adaugaStudent(studentFake);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
		
	}

}
