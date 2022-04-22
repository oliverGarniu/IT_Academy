package demo;

import abstractFactories.AbstractFactory;
import abstractFactories.IAdreça;
import abstractFactories.ITelefon;

public class Application {

	private IAdreça adreça;
	private ITelefon telefon;

	public Application(AbstractFactory aFactory) {
		adreça = aFactory.addAdreça();
		telefon = aFactory.addTelefon();
	}

	public void add() {
		adreça.add();
		telefon.add();
	}

}
