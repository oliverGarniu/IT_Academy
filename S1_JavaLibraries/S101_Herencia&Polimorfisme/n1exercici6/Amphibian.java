package n1exercici6;

public class Amphibian {

	private String color;
	private boolean nadar;
	private boolean cogerAire;
	private boolean dientes;
	private int numPatas;
	private String paisOrigen;

	public Amphibian(String color, int numPatas, String paisOrigen) {
		this.color = color;
		this.numPatas = numPatas;
		this.paisOrigen = paisOrigen;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String moure(boolean nadar, int numPatas) {

		String missatge;

		if (nadar == true) {
			missatge = "Es desplaça nedant";
		} else {
			missatge = "Es desplaça caminant";
		}

		return missatge;
	}

	public String respirar(boolean cogerAire) {

		String missatge;

		if (cogerAire == true) {
			missatge = "SI ha de sortir a la superficie per respirar";
		} else {
			missatge = "NO li cal sortir a la superficie per respirar";
		}

		return missatge;
	}

	public String menjar(String color, boolean dientes) {

		String missatge;

		if (dientes == true) {
			missatge = "Menja altres animals";
		} else {
			missatge = "Menja microorganismes que hi ha a l´aigua";
		}

		return missatge;
	}

	@Override
	public String toString() {
		return "Amphibian [color=" + color + ", nadar=" + nadar + ", cogerAire=" + cogerAire + ", dientes=" + dientes
				+ ", numPatas=" + numPatas + ", paisOrigen=" + paisOrigen + "]";
	}

}
