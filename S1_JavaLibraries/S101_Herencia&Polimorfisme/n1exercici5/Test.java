package n1exercici5;

//Exercici 5. Crea una classe Animal amb el mètode correr() sobrecarregat tres vegades. 
//Defineix una nova classe (per exemple Gat) que hereti de l'anterior i afegeix una nova 
//versió sobrecarregada del mateix mètode. Mostra que els quatre mètodes estan disponibles 
//a la classe derivada (per exemple enviant un missatge a la consola).

public class Test {

	public static void main(String[] args) {

		Gat mixu = new Gat(4, true, "gris", 20, 5, "cruce");

		System.out.println(mixu.correr(true));
		System.out.println(mixu.correr(0));
		System.out.println(mixu.correr(false, 0));
		System.out.println(mixu.correr(0, null));
		System.out.println(mixu.correr(0, 0));

	}

}
