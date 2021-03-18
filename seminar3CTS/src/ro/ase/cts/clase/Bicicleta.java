package ro.ase.cts.clase;

public class Bicicleta {
	
	private String marca;
	private double vitezaMaxima;
	private String culoare;
	
	private static Bicicleta bicicleta=null;

	private Bicicleta(String marca, double vitezaMaxima, String culoare) {
		this.marca = marca;
		this.vitezaMaxima = vitezaMaxima;
		this.culoare = culoare;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setVitezaMaxima(double vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	public static synchronized Bicicleta getInstance(String marca, double vitezaMaxima, String culoare ) {
		if(bicicleta==null)
			bicicleta=new Bicicleta( marca,  vitezaMaxima,  culoare );
	
		return bicicleta;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", vitezaMaxima=" + vitezaMaxima + ", culoare=" + culoare + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
