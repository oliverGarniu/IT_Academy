package countries;

import java.util.ArrayList;

import abstractFactories.ITelefon;

public class UKTel implements ITelefon {

	private String prefix;
	private String numTelefon;

	public UKTel() {

	}

	public UKTel(String prefix, String numTelefon) {
		super();
		this.prefix = "+44";
		this.numTelefon = numTelefon;

	}

	@Override
	public void add() {

		System.out.println("Hem afegit el telèfon d´UK a l´agenda.");

	}

}
