package n1exercici1;

//Exercici 1. Crea una classe (per exemple Principal) amb un main() 
//que generi un objecte de la classe Exception dins d'un bloc try-catch. 
//Proporcioni al constructor de Exception un missatge especific. 
//Capturi l'excepció dins d'una clàusula catch i imprimeix el missatge 
//de l'excepció. Afegeix una clàusula finally i imprimeix un missatge 
//per a demostrar que va passar per allí.

public class Principal {

	public static void main(String[] args) {

		try {

			Exception excepcio = new Exception("Possible error");
			System.out.println(excepcio);
//			int num = Integer.parseInt("Hola");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Hi ha hagut un error! int enlloc d´ String entre cometes");

		} finally {
			System.out.println("He passat per finally");
		}

	}

}
