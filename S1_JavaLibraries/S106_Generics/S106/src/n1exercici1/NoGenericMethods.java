package n1exercici1;

import java.util.ArrayList;

//Exercici 1. Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes 
//del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests 
//objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es 
//poden posar en qualsevol posició en la crida al constructor.

public class NoGenericMethods {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		Vehicle vehicle1 = new Vehicle(4, "Cotxe", 5);
		vehicles.add(vehicle1);
		Vehicle vehicle2 = new Vehicle("Moto", 2, 7);
		vehicles.add(vehicle2);
		Vehicle vehicle3 = new Vehicle(6, 5, "Furgoneta");
		vehicles.add(vehicle3);

		for (Vehicle v : vehicles) {

			System.out.println(v);

		}

	}
}
