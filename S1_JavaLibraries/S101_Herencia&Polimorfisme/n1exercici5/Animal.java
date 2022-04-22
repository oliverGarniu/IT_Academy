package n1exercici5;

public class Animal {

	private int numPatas;
	private boolean cola;
	private String color;
	private int velocidad;

	public Animal(int numPatas, boolean cola, String color, int velocidad) {
		super();
		this.numPatas = numPatas;
		this.cola = cola;
		this.color = color;
		this.velocidad = velocidad;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public boolean isCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String correr(int numPatas) {

		return "Tiene " + this.numPatas + " patas";
	}

	public String correr(boolean cola) {

		String missatge;

		if (cola == true) {
			missatge = "Tiene cola";
		} else {
			missatge = "No tiene cola";
		}
		return missatge;

	}

	public String correr(boolean cola, int numPatas) {

		return "Tiene cola y " + this.numPatas + " patas";
	}

	@Override
	public String toString() {
		return "Animal [numPatas=" + numPatas + ", cola=" + cola + ", color=" + color + ", velocidad=" + velocidad
				+ "]";
	}

}
