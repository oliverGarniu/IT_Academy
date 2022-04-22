package n1exercici1_5;

import java.util.ArrayList;

//Crea una llista amb  els nombs dels mesos de  l’any. Imprimeix tots els  elements de 
//la llista amb  una lambda. 

public class Test {

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
		mesosAny.add("Desembre");

		mesosAny.forEach(s -> System.out.println(s));

	}

}
