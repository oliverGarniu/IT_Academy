package n1exercici8;

//Exercici 8. Modifica l'exercici anterior perquè l'objecte Frog substitueixi les 
//definicions de mètodes de la classe base (proporcioni noves definicions utilitzant 
//les mateixes signatures de mètodes). Demostri que ocorre al mètode main(), si manté 
//la generalització anterior o no.

public class Test {

	public static void main(String[] args) {

		Amphibian amfibi = new Frog("verd", 4, "Costa Rica", "pequeño", true);
//		Frog froggy = new Frog("verd", 4, "Costa Rica", "pequeño", true);
		
		System.out.println(amfibi);

		System.out.println(amfibi.menjar(null, false));
		System.out.println(amfibi.moure(true, 0));
		System.out.println(amfibi.respirar(true));
		//Comprobem com, mantenint la generalització, els mètodes "repetits" de 
		//la subclasse Frog, amb les definicions de la superclasse Amphibian 
		//substituides SI que s´han executat correctament desde el main. Sobre escriptura.
		
//		System.out.println(amfibi.saltar(4, "pequeño"));
//		System.out.println(froggy.saltar(4, "pequeño"));
		//El mètode saltar de la subclasse Frog continarà donant error mentre 
		//existeixi la generalització.
	}
}