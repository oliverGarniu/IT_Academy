package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Generadora {

	public Generadora() {
		personatges = new ArrayList<String>();
		
		personatges.add("p6");
		personatges.add("p3");
		personatges.add("p1");
		personatges.add("p2");
		personatges.add("p5");
		personatges.add("p4");
		personatges.add("p8");
		personatges.add("p7");
		personatges.add("p8");
		personatges.add("p9");
		personatges.add("p9");
		personatges.add("p9");
	}

	private List<String> personatges = null;

	private int posicioActual = 0;

	public void reset() {
		this.posicioActual = 0;
	}

	public String next() {
		String result = null;
		if (posicioActual < personatges.size()) {
			result = personatges.get(posicioActual);
			posicioActual++;
		} else {
			result = null;
		}
		return result;
	}

}
