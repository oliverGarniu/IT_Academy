package n1exercici2;

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
	
	/**
	 * 
	 * @deprecated
	 * Hem de vigilar molt en el moment de treure els gats de les gàbies perquè es podrien escapar.
	 */
	@Deprecated
	
	public String treurePassejar() {
		return "Els gats poden sortir a passejar només dins d´espais tancats.";
		
	}

	@Override
	public String toString() {
		return "Gat [tipusPel=" + tipusPel + ", raça=" + raça + "]";
	}

}
