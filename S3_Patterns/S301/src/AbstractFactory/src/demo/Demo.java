package demo;

import abstractFactories.AbstractFactory;
import abstractFactories.ConcreteFactoryGermany;
import abstractFactories.ConcreteFactoryUK;

public class Demo {

	private static Application configureApplication() {

		Application app;
		AbstractFactory aFactory;

		String countryName = "UK";
		
		if (countryName.equalsIgnoreCase("Germany")) {
			aFactory = new ConcreteFactoryGermany();
			app = new Application(aFactory);
		} else {
			aFactory = new ConcreteFactoryUK();
			app = new Application(aFactory);
		}
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.add();

	}

}
