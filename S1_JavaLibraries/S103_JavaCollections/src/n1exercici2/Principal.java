package n1exercici2;

import java.util.ArrayList;
import java.util.HashSet;

//Exercici 2. Asseguri's que si convertim el Contenidor utilitzat en el punt anterior a 
//un Contenidor HashSet, aquest no permet duplicats. Verifica-ho.

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> mesosAny = new ArrayList<String>();

		mesosAny.add("Gener");
		mesosAny.add("Febrer");
		mesosAny.add("Març");
		mesosAny.add("Abril");
		mesosAny.add("Maig");
		mesosAny.add("Juny");
		mesosAny.add("Juliol");
		mesosAny.add("Agost");
		mesosAny.add("Setembre");
		mesosAny.add("Octubre");
		mesosAny.add("Novembre");
		mesosAny.add("Decembre");
		mesosAny.add("Agost");
		mesosAny.add("Agost");

		System.out.println("**Amb duplicats**");

		for (String temp : mesosAny) {
			System.out.println(temp);
		}

		HashSet<String> hashset = new HashSet<String>(mesosAny);

		System.out.println("\n**Sense duplicats**");

		for (String temp : hashset) {
			System.out.println(temp);
		}

	}

}
