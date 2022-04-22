package n1exercici1;

public class Animal {

	private String color;
	private String tamany;
	private int edat;

	public Animal(String color, String tamany, int edat) {
		super();
		this.color = color;
		this.tamany = tamany;
		this.edat = edat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamany() {
		return tamany;
	}

	public void setTamany(String tamany) {
		this.tamany = tamany;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	public String menjar() {
		
		return "Tots els animals han de menjar mínim un cop al dia";
	}
	
	@Override
	public String toString() {
		return "Animal [color=" + color + ", tamany=" + tamany + ", edat=" + edat + "]";
	}

}
