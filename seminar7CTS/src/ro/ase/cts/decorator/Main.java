package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
	CardAbstract card = new Card("Ionescu");
	card.realizeazaPlataNormala();
	card.realizeazaPlataOnline();
	
	DecoratorAbstract decoratorAbstract=(DecoratorAbstract) new DecoratorContactless(card);
	
	decoratorAbstract.realizeazaPlataContactless();
	decoratorAbstract.realizeazaPlataNormala();
	decoratorAbstract.realizeazaPlataOnline();
	
	}
	
}
