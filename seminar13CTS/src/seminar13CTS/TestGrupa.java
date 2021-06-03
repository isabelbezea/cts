package seminar13CTS;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import seminar13CTS.categorii.TesteGetPromovabilitate;
import seminar13CTS.categorii.TesteNormale;
import seminar13CTS.categorii.TesteUrgente;

public class TestGrupa {
	
	private Grupa grupa;
	
	
	
	
	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++)
		{
			Student student=new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.05);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua=new Grupa(1077);
		grupaNoua.getPromovabilitate();
				
	}
	
	@Test(timeout=500)
	public void testTimeoutPromovabilitate() {
		grupa.getPromovabilitate();
	}
	
	
	@Test
	@Category({TesteUrgente.class})
	public void TestConstructorRight() {
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
}
	@Test
	@Category({TesteNormale.class})
	public void testLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorError() {
		Grupa grupa=new Grupa(100);
	}
	
	@Test(timeout=500)
	public void testPerformance() {
		Grupa grupa=new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	


}