package n1exercici2;

public class Vehicle {

	private int velocitatMax;
	private int potencia;
	private String color;

	public Vehicle(int velocitatMax, int potencia, String color) {
		super();
		this.velocitatMax = velocitatMax;
		this.potencia = potencia;
		this.color = color;
	}

	public int getVelocitatMax() {
		return velocitatMax;
	}

	public void setVelocitatMax(int velocitatMax) {
		this.velocitatMax = velocitatMax;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String iniciar() {

		String missatge = "El cotxe està arrancant";

		return missatge;
	}
	
	public static String parar() {
		
		return "El cotxe està parant";
		
	}
	
	public String accelerar() {
		
		return "El cotxe està accelerant";
		
	}

	@Override
	public String toString() {
		return "Vehicle [velocitatMax=" + velocitatMax + ", potencia=" + potencia + ", color=" + color + "]";
	}

}
