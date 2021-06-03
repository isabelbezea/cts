package seminar13CTS.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import seminar13CTS.Grupa;
import seminar13CTS.IStudent;
import seminar13CTS.dubluri.StudentStub;

public class TestGrupaWithStudentStub {

	
	@Test
	public void testGetPromovabilitate() {
		Grupa grupa=new Grupa(1077);
		IStudent student= new StudentStub();
		grupa.adaugaStudent(student);
		
		IStudent student1= new StudentStub();
		grupa.adaugaStudent(student1);
		
		assertEquals(1, grupa.getPromovabilitate(),  0.01);
		
		
	}

}
