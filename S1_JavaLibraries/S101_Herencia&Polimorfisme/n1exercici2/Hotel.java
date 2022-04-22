package n1exercici2;

//Exercici 2. Defineix una referència a un objecte (de qualsevol tipus: String, Integer, 
//o personalitzat) i inicialitza-la amb null. Tracta d'invocar un mètode a través d'aquesta 
//referència. Ara envolti el codi amb una clàusula try-catch per a capturar l'excepció. 
//Mostra el missatge i el tipus d'excepció.

public class Hotel {

	public static void main(String[] args) {

//		String nomHab = "Tramuntana";
		Room habitacio = new Room(null);

		nomHabitacio(habitacio);

	}

	public static void nomHabitacio(Room habitacio) {

		try {
			if (habitacio.getNomHab().equalsIgnoreCase("Ona")) {
				System.out.println("Same");
			} else {
				System.out.println("Not Same");
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("NullPointerException Caught!!");

		} finally {
			System.out.println("finally");

		}

	}

}
