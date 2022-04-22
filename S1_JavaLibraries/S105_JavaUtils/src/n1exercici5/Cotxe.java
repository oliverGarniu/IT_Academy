package n1exercici5;

public class Cotxe extends Vehicle {

	private String marca;
	private String color;
	private int potencia;

	public Cotxe(String tipusVehicle, int numRodes, int antiguitat, String marca, String color, int potencia) {
		super(tipusVehicle, numRodes, antiguitat);
		this.marca = marca;
		this.color = color;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Cotxe [marca=" + marca + ", color=" + color + ", potencia=" + potencia + "]";
	}

}
