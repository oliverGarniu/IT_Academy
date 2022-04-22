package n1exercici6;

public class Frog extends Amphibian {

	private String tamaño;
	private boolean venenosa;

	public Frog(String color, int numPatas, String paisOrigen, String tamaño, boolean venenosa) {
		super(color, numPatas, paisOrigen);
		this.tamaño = tamaño;
		this.venenosa = venenosa;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isVenenosa() {
		return venenosa;
	}

	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}

	@Override
	public String toString() {
		return "Frog [tamaño=" + tamaño + ", venenosa=" + venenosa + ", Color=" + getColor() + ", NumPatas="
				+ getNumPatas() + ", PaisOrigen=" + getPaisOrigen() + "]";
	}

}
