package n1exercici3;

public class Vehicle {

	private int velocitatMax;
	private int potencia;
	private String color;

	public Vehicle(int velocitatMax, int potencia, String color) {
		this.velocitatMax = velocitatMax;
		this.potencia = potencia;
		this.color = color;
		
		System.out.println("Constructor");

	}

//He posat els blocs barrejats per veure millor el seu funcionament.
	
	
	static {

		System.out.println("Bloc inicialització static 1 - Classe (només 1 vegada)");

	}

	public static void parar() {

		System.out.println("El cotxe està parant");

	}

	{
		System.out.println("Bloc inicialització 1 - Instància (per cada instància)");
	}

	static {

		System.out.println("Bloc inicialització static 2 - Classe (només 1 vegada)");

	}

	{
		System.out.println("Bloc inicialització 2 - Instància (per cada instància)");
	}

	public void repostatge() {
		System.out.println("S´està omplint el dipòsit de benzina");
	}

	{
		System.out.println("Bloc inicialització 3 - Instància (per cada instància)");
	}

	@Override
	public String toString() {
		return "Vehicle [velocitatMax=" + velocitatMax + ", potencia=" + potencia + ", color=" + color + "]";
	}
}
