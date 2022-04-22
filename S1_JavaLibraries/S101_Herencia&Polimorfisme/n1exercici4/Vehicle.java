package n1exercici4;

public class Vehicle {

	private int velocitatMax;
	private int potencia;
	private String color;

	private static final int NUM_RUEDAS = 4; // aquest valor no canvia (constant).
	private final String ESCUDERIA = "Cupra";// aquest valor no canvia (constant). Es crearà de nou per cada objecte de la classe (no estàtic).
	private static String pais; // Es podrà accedir a camps estàtics (no final) desde mètodes estàtics.
	// La variable estàtica es crea una vegada per tots els objectes de la classe.
	
	//Els camps final no els podrem modificar un cop iniciem el programa, tal i com veiem a l´hora de generar els "getters and setters".
	
	public Vehicle(int velocitatMax, int potencia, String color, int NUM_RUEDAS, String ESCUDERIA, String pais) {
		this.velocitatMax = velocitatMax;
		this.potencia = potencia;
		this.color = color;
		Vehicle.pais = pais;
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

	public static String getPais() {
		return pais;
	}

	public static void setPais(String pais) { 
		Vehicle.pais = pais;
	}

	public static int getNumRuedas() {
		return NUM_RUEDAS;
	}

	public String getESCUDERIA() {
		return ESCUDERIA;
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
