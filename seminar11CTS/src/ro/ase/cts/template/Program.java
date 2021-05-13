package ro.ase.cts.template;

public class Program {

	public static void  main(String[] args)
	{
		Spectator    spectator1= new Spectator("Marcel");
		SpectatorAbstract spectator2= new Spectator("Ileana");
		
		spectator1.intrareSpectatorStadion();
		spectator2.intrareSpectatorStadion();
		
		SpectatorAbstract spectatorVIP= new SpectatorVIP("Ionescu");
		
		spectatorVIP.intrareSpectatorStadion();
	}
}
