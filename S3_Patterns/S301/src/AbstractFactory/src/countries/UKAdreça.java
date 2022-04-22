package countries;

import abstractFactories.IAdreça;

public class UKAdreça implements IAdreça {

	private String address;
	private String zipCode;

	public UKAdreça() {

	}

	public UKAdreça(String address, String zipCode) {
		super();
		this.address = address;
		this.zipCode = zipCode;
	}

	@Override
	public void add() {

		System.out.println("Hem afegit l´adreça d´UK a l´agenda.");

	}

}
