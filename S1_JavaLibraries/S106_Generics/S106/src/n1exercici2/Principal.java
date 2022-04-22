package n1exercici2;

//Exercici 2. Crea una classe anomenada GenericMethods amb un mètode genèric
//anomenat f() que accepti tres arguments de tipus genèric. Realitza al main() 
//diferents crides  d'aquest mètode amb diferents tipus de parametres. 
//Comprova que es poden posar qualsevol tipus de variable.

public class Principal {

	public static void main(String[] args) {

		GenericMethods exempleInstancia = new GenericMethods("Josep", "Vilalta", 44);

		System.out.println(exempleInstancia + "\n");

		// Ara realitzem tres crides del mètode valorLletres() amb diferents tipus de
		// paràmetres.

		System.out.println(GenericMethods.valorLletres(4.25, 328, "Blanc"));
		System.out.println(GenericMethods.valorLletres(true, false, true));
		System.out.println(GenericMethods.valorLletres("Maria", 33.51416, true));

	}

}
