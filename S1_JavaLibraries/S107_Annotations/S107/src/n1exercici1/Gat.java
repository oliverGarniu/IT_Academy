package n1exercici1;

public class Gat extends Animal {

	private String tipusPel;
	private String raça;

	public Gat(String color, String tamany, int edat, String tipusPel, String raça) {
		super(color, tamany, edat);
		this.tipusPel = tipusPel;
		this.raça = raça;
	}

	public String getTipusPel() {
		return tipusPel;
	}

	public void setTipusPel(String tipusPel) {
		this.tipusPel = tipusPel;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public String menjar() {

		return "Els gats han de menjar tres cops al dia";
	}

	@Override
	public String toString() {
		return "Gat [tipusPel=" + tipusPel + ", raça=" + raça + "]";
	}

}
