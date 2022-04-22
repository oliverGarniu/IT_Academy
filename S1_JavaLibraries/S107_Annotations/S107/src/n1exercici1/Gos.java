package n1exercici1;

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

	@Override
	public String toString() {
		return "Gos [raça=" + raça + ", cua=" + cua + "]";
	}

}
