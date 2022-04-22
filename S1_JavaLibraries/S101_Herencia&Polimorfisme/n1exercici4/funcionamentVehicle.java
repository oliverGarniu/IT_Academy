package n1exercici4;

//Exercici 4. A la classe 'Vehicle' afegeix un camp static final, un camp final i 
//un camp static. Demostra la diferència entre els tres. 
//Quins es poden inicialitzar al constructor de la classe?

public class funcionamentVehicle {

	public static void main(String[] args) {

		// Podrem obtenir el camp static sense haver d´instanciar un objecte.

		System.out.println(Vehicle.getPais());

		Vehicle vehicle = new Vehicle(350, 650, "blanc", 0, null, "Italia");
		System.out.println(vehicle);
		// A l´hora d´imprimir l´objecte cap dels tres camps (static final, static, final) surt imprès a la consola.
		
		// A l´hora de debugar veiem que el camp final (no static), en aquest cas ESCUDERIA, si que 
		//surt reflexat com a variable del constructor, juntament amb la resta (color, potencia, velocitatMax), 
		//tot i que no l´imprimeix.
		
		System.out.println(vehicle.iniciar());

	}

}
