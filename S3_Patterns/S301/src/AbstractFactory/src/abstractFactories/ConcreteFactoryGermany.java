package abstractFactories;

import countries.GermanyAdreça;
import countries.GermanyTel;

public class ConcreteFactoryGermany implements AbstractFactory{

	@Override
	public IAdreça addAdreça() {
		
		return new GermanyAdreça();
	}

	@Override
	public ITelefon addTelefon() {
		
		return new GermanyTel();
	}

}
