package n1exercici8;

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

		if (numPatas == 4 && (tamaño.equalsIgnoreCase("pequeño") || tamaño.equalsIgnoreCase("mediano"))) {
			missatge = "La granota SI pot saltar";
		} else {
			missatge = "La granota NO pot saltar";
		}
		return missatge;
	}

	public String moure(boolean nadar, int numPatas) {

		String missatge;

		if (nadar == true) {
			missatge = "Es desplaça nedant i també reptant";
		} else {
			missatge = "Es desplaça caminant i també reptant";
		}

		return missatge;
	}

	public String respirar(boolean cogerAire) {

		String missatge;

		if (cogerAire == true) {
			missatge = "Ha de sortir a la superficie per respirar com a mínim un cop per minut";
		} else {
			missatge = "Només ha de sortir a la superficie per respirar un cop cada 15 minuts aproximadament";
		}

		return missatge;
	}

	public String menjar(String color, boolean dientes) {

		String missatge;

		if (dientes == true) {
			missatge = "Menja microorganismes i també altres animals més petits";
		} else {
			missatge = "NOMÉS menja microorganismes que hi ha a l´aigua";
		}

		return missatge;
	}
	
	@Override
	public String toString() {
		return "Frog [tamaño=" + tamaño + ", venenosa=" + venenosa + ", Color=" + getColor() + ", NumPatas="
				+ getNumPatas() + ", PaisOrigen=" + getPaisOrigen() + "]";
	}
}
