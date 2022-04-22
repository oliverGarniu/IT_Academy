package n1exercici1_6;

import java.util.ArrayList;

//Has de  fer la mateixa impressió del punt  anterior  però fent-ho mitjançant method   
//reference. 

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

		mesosAny.forEach(System.out::println); // method reference
	}

}
