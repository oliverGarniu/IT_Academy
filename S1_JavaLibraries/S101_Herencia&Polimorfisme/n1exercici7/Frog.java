package n1exercici7;

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

	public String saltar(int numPatas, String tamaño) {

		String missatge;
		
		if(numPatas == 4 && (tamaño.equalsIgnoreCase("pequeño") || tamaño.equalsIgnoreCase("mediano"))) {
			missatge = "La granota SI pot saltar";
		} else {
			missatge = "La granota NO pot saltar";
		}
		return missatge;

	}

	@Override
	public String toString() {
		return "Frog [tamaño=" + tamaño + ", venenosa=" + venenosa + ", Color=" + getColor() + ", NumPatas="
				+ getNumPatas() + ", PaisOrigen=" + getPaisOrigen() + "]";
	}

}
