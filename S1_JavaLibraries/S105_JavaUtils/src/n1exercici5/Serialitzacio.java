package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Exercici 5. Mostri com serialitzar un Objecte Java a un fitxer .ser i deserialícelo després.

public class Serialitzacio {

	public static void main(String[] args) {

		Cotxe car1 = new Cotxe("Cotxe", 4, 5, "Opel", "Blanc", 200);
		Cotxe car2 = new Cotxe("Cotxe", 4, 7, "Volkswagen", "gris", 180);

		Vehicle[] vehicles = new Vehicle[4];

		vehicles[0] = car1;
		vehicles[1] = car2;
		vehicles[2] = new Vehicle("Furgoneta", 6, 8);
		vehicles[3] = new Vehicle("Moto", 2, 3);

		System.out.println("\n**Arxiu creat**");

		for (Vehicle v : vehicles) {

			System.out.println(v);
		}

		try {

			ObjectOutputStream escriureArxiu = new ObjectOutputStream(new FileOutputStream("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori/arxiuExercici5.ser"));

			escriureArxiu.writeObject(vehicles);

			escriureArxiu.close();

			ObjectInputStream recuperantArxiu = new ObjectInputStream(new FileInputStream("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori/arxiuExercici5.ser"));

			// Creem un Array per emmagatzemar l´arxiu, que és un array. Arxiu desat a un fitxer.

			Vehicle[] arxiuRecuperat = (Vehicle[]) recuperantArxiu.readObject();

			recuperantArxiu.close();

			System.out.println("\n**Arxiu recuperat**");

			for (Vehicle v : arxiuRecuperat) {

				System.out.println(v);

			}

		} catch (Exception e) {

		}

	}

}
