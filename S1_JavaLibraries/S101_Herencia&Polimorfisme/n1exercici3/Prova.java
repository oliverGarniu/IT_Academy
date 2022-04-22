package n1exercici3;

//Exercici 3. Demostra que el procés de càrrega d'una classe només té lloc una vegada. 
//Demostra que la càrrega pot ser provocada per la creació de la primera instància 
//d'aquesta classe o per l'accés a un membre estàtic d'aquesta. Idea: Cerca informació 
//sobre els blocs d'inicialització a Java.

public class Prova {

//El bloc d´inicialització static s´executarà només una vegada (iniciant el programa)

	public static void main(String[] args) {

		Vehicle.parar(); // mètode static

		Vehicle vehicle1 = new Vehicle(300, 550, "negre"); // els blocs d´inicialització d´instancia s´executarà cada
															// vegada que instanciem un nou objecte.

		// els blocs d´inicialització d´instancia s´executen primer, en el mateix ordre de
		// dalt a baix, i després s´executaria el constructor (encara que aquest
		// aparegui abans)

		System.out.println(vehicle1);

		Vehicle vehicle2 = new Vehicle(400, 600, "groc");
		System.out.println(vehicle2);

		vehicle1.repostatge();

	}

}
