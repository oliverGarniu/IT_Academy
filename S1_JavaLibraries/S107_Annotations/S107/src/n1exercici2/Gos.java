package n1exercici2;

public class Gos extends Animal {

	private String raça;
	private boolean cua;

	public Gos(String color, String tamany, int edat, String raça, boolean cua) {
		super(color, tamany, edat);
		this.raça = raça;
		this.cua = cua;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public boolean isCua() {
		return cua;
	}

	public void setCua(boolean cua) {
		this.cua = cua;
	}

	@Override
	public String menjar() {

		return "Els gossos han de menjar dos cops al dia";
	}

	/**
	 * @deprecated 
	 * Hem de vigilar molt a l´hora de posar gossos de diferents
	 *families dins la mateixa gossera ja que es podrien barallar.
	 */

	@Deprecated

	public String compartirGossera() {

		return "En cas de que no hi hagi gosseres buides, podrem posar gossos de diferents families a la mateixa gossera.";
	}

	@Override
	public String toString() {
		return "Gos [raça=" + raça + ", cua=" + cua + "]";
	}

}
