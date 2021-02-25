package seminar1CTS;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		Zoo zoo=new Zoo();
		Zookeeper keeper=new  Zookeeper("Gigel");
		
		zoo.setKeeper(keeper);
		
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		
		zoo.add(zebra1); zoo.add(zebra2);
		
		zoo.feedAll();
		
		
		Giraffe giraffe1=new Giraffe("girafa1");
		Giraffe giraffe2=new Giraffe("girafa2");
		
		zoo.add(giraffe1); zoo.add(giraffe2);
		
		zoo.feedAll();
		
		
	}

}
