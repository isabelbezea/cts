package clase;

public class Zookeeper {
	private String name;
	
	
	
	
	public Zookeeper() {
		super();
	}



	public Zookeeper(String name) {
		this.name=name;
	}



	public void feed(Animal animal)
	{
		System.out.println(name+" hraneste animalul "+animal.getName());
	}

}
