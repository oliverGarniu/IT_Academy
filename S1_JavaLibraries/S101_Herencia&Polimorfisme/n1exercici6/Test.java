package n1exercici6;

//Exercici 6. Crea una classe denominada Amphibian i inclou una sèrie de mètodes: moure(), 
//respirar() i menjar(). Defineix una nova classe denominada Frog que hereti de l'anterior. 
//Al main() crea un objecte Frog i realitza una generalització a Amphibian, demostrant que 
//tots els mètodes continuen funcionant.

public class Test {

	public static void main(String[] args) {

		Amphibian amfibi = new Frog("verd", 4, "Costa Rica", "pequeño", true);
		System.out.println(amfibi);

		System.out.println(amfibi.menjar(null, false));
		System.out.println(amfibi.moure(true, 0));
		System.out.println(amfibi.respirar(true));

	}

}
