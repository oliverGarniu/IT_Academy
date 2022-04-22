package n1exercici7;

//Exercici 7. A l'exercici anterior crea un nou mètode saltar() a la classe Frog i 
//crida’l des del main(), desprès de fer la generalització a Amphibian. Demostra que 
//la crida a aquest mètode saltar dona error.

public class Test {

	public static void main(String[] args) {

		Amphibian amfibi = new Frog("verd", 4, "Costa Rica", "pequeño", true);
		System.out.println(amfibi);

		System.out.println(amfibi.menjar(null, false));
		System.out.println(amfibi.moure(true, 0));
		System.out.println(amfibi.respirar(true));
		
//		System.out.println(amfibi.saltar(4, "pequeño"));
		//Comprobem com efectivament la crida del mètode saltar, que està dins la classe Frog, dóna error.

	}

}
