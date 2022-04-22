package n1exercici4;

//Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep f() sigui 
//una llista d'arguments de variable indefinida.

public class Principal {

	public static void main(String[] args) {

		GenericMethods.numArgs(328, "Blanc", 23, 43, "Negre", 4.25, true);
		GenericMethods.numArgs("Blanc", "Negre", true);
		GenericMethods.numArgs(328, "Blanc", 23, 43, 4.25);
		

	}

}
