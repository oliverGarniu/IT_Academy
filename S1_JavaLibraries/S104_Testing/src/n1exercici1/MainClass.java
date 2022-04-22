package n1exercici1;

//Exercici 1. Crea una classe Java que insereixi en una llista ordenada els noms dels 
//mesos de l'any. Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i 
//que en la seva posició 8 conté el nom 'Agost'.

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public List<String> mesosAny = new ArrayList<String>();

	public boolean posicioArray(int i) {

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

		if (mesosAny.get(8).equalsIgnoreCase("Agost")) { //agost correspondria a la posició 7
			return true;
		} else {
			return false;
		}

	}

	public boolean arrayNull(ArrayList<String> mesosAny) {

		if (mesosAny.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean arraySize(ArrayList<String> mesosAny) {

		if (mesosAny.size() == 12) {
			return true;
		} else {
			return false;
		}

	}
}
