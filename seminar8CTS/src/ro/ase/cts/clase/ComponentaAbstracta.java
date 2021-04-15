package ro.ase.cts.clase;

public interface ComponentaAbstracta {
	
	public void afiseazaDescriere();
	
	public void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;

	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) ;
	
	public ComponentaAbstracta getCompponenta(int pozitie) ;
	
}
