package n1exercici5;

import java.io.Serializable;

public class Vehicle implements Serializable {

	private String tipusVehicle;
	private int numRodes;
	private int antiguitat;

	public Vehicle(String tipusVehicle, int numRodes, int antiguitat) {
		super();
		this.tipusVehicle = tipusVehicle;
		this.numRodes = numRodes;
		this.antiguitat = antiguitat;
	}

	public String getTipusVehicle() {
		return tipusVehicle;
	}

	public void setTipusVehicle(String tipusVehicle) {
		this.tipusVehicle = tipusVehicle;
	}

	public int getNumRodes() {
		return numRodes;
	}

	public void setNumRodes(int numRodes) {
		this.numRodes = numRodes;
	}

	public int getAntiguitat() {
		return antiguitat;
	}

	public void setAntiguitat(int antiguitat) {
		this.antiguitat = antiguitat;
	}

	@Override
	public String toString() {
		return "Vehicle [tipusVehicle=" + tipusVehicle + ", numRodes=" + numRodes + ", antiguitat=" + antiguitat + "]";
	}

}