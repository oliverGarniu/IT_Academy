package n1exercici2;

//Exercici 2. Afegeix a les classes fills alguns mètodes deprecados, i utilitzi la 
//anotacion corresponent. Invoqui des d'una classe externa els mètodes deprecados, 
//suprimint mitjançant l'anotació corresponent els warnings per ser deprecada la seva 
//utilització.

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Gos gos = new Gos("Negre", "Petit", 8, "Creuat", true);
		Gat gat = new Gat("Gris", "Mitjà", 4, "Pel llarg", "Siamès");
		
		System.out.println(gos.menjar());
		System.out.println(gat.menjar());
		
		System.out.println();
		
		System.out.println(gos.compartirGossera());
		System.out.println(gat.treurePassejar());

		
	}

}
