package n1exercici1;

//Exercici 1. Crea una classe 'Vehicle' amb 2 mètodes: un constructor i 
//un mètode anomenat 'Iniciar', que es invocat pel 'main()' (aquest mètode 
//pot estar en la mateixa classe o en una classe apart) . Demostra la seqüència 
//d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).

public class funcionamentVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(350, 650, "blanc");
		System.out.println("El color del vehicle és: " + vehicle.getColor());

		System.out.println(vehicle.iniciar());

	}

}
