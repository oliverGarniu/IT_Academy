package n1exercici1;

//Exercici 1. Crea una jerarquia d'objectes Java on els objectes fill sobreescriguin 
//alguna funcionalitat de l'objecte pare emprant @Override. Afegeix una classe que 
//efectuï les invocacions necessàries demostrant el punt anterior.

public class Test {

	public static void main(String[] args) {

		Gos gos = new Gos("Negre", "Petit", 8, "Creuat", true);
		Gat gat = new Gat("Gris", "Mitjà", 4, "Pel llarg", "Siamès");
		
		System.out.println(gos.menjar());
		System.out.println(gat.menjar());

	}

}
