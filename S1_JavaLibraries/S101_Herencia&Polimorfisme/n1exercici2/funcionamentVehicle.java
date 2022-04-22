package n1exercici2;

//Exercici 2. A la classe 'Vehicle' afegeix dos mètodes: un static anomenat 'parar' i 
//un altre no-static anomenat 'accelerar'. Demostra com invocar el mètode static i 
//el no-static des del 'main()' (per exemple, enviant un missatge a la consola).

public class funcionamentVehicle {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle(350, 650, "blanc");
		System.out.println("El color del vehicle és: " + vehicle1.getColor());

		System.out.println(vehicle1.iniciar());

		System.out.println(Vehicle.parar()); //en aquest cas no cal instanciar un objecte per tal d´invocar el mètode (static).
		System.out.println(vehicle1.accelerar());

	}

}
