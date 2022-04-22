package abstractFactories;

import countries.UKAdreça;
import countries.UKTel;

public class ConcreteFactoryUK implements AbstractFactory{

	@Override
	public IAdreça addAdreça() {
		
		return new UKAdreça();
	}

	@Override
	public ITelefon addTelefon() {
		
		return new UKTel();
	}

}
