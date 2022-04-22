package countries;

import java.util.ArrayList;
import java.util.List;

import abstractFactories.IAdreça;

public class GermanyAdreça implements IAdreça {

	private String address;
	private int zipCode;

	public GermanyAdreça() {

	}

	public GermanyAdreça(String address, int zipCode) {
		super();
		this.address = address;
		this.zipCode = zipCode;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public void add() {

		System.out.println("Hem afegit l´adreça d´Alemanya a l´agenda.");

	}

	@Override
	public String toString() {
		return "GermanyAdreça [address=" + address + ", zipCode=" + zipCode + "]";
	}

}
