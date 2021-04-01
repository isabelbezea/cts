package ro.ase.cts.builderv2;

public class Program {

	public static void main(String[] args) {
		
		RezervareBuilder builder=new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).setAreBauturaRacoritoare(true);

		Rezervare rezervare1=builder.build();
		builder.setCodRezervare(2).setAreMancareInclusa(true);
		
		Rezervare rezervare2=builder.build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		RezervareBuilder builder2=new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(3);
		
		Rezervare rezevare3=builder2.build();
		
		System.out.println(rezevare3.toString());
	}

}
