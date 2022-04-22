package countries;

import abstractFactories.ITelefon;

public class GermanyTel implements ITelefon {

	private String prefix;
	private String numTelefon;

	public GermanyTel() {

	}

	public GermanyTel(String prefix, String numTelefon) {
		super();
		this.prefix = "+49";
		this.numTelefon = numTelefon;
	}

	@Override
	public void add() {

		System.out.println("Hem afegit el telèfon d´Alemanya a l´agenda.");
	}

}
