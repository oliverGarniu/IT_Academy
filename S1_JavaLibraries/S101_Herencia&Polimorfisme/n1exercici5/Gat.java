package n1exercici5;

public class Gat extends Animal {

	private int edad;
	private String raza;

	public Gat(int numPatas, boolean cola, String color, int velocidad, int edad, String raza) {
		super(numPatas, cola, color, velocidad);
		this.edad = edad;
		this.raza = raza;
	}

	public String correr(int edad, String raza) {

		return "El gato tiene " + this.edad + " años, y es de raza " + this.raza;
	}

	public String correr(int velocidad, int edad) {
		
		return "El gato, que tiene " + this.edad + " años, puede llegar a correr a una velocidad de " + this.getVelocidad() + " Km/h";
	}
}
