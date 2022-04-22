package n1exercici1_1;

import java.util.ArrayList;

//Tenint una llista de cadenes de noms propis,  escriu un mètode que retorn e una llista 
//de totes les cadenes que  comencen amb la lletra 'a' (mayuscula ) i  tenen exactament 3 
//lletres. Imprimeix el resultat. 

public class Test {

	public static void main(String[] args) {

		ArrayList<String> nomsPropis = new ArrayList<String>();

		nomsPropis.add("Josep");
		nomsPropis.add("Ali");
		nomsPropis.add("Carles");
		nomsPropis.add("Emma");
		nomsPropis.add("Ann");
		nomsPropis.add("Arnau");

		nomsPropis.stream().filter(c -> c.startsWith("A") && c.length() == 3).forEach(c -> System.out.println(c));

	}
}

//		Cadena c = () -> {
//
//			for (String s : nomsPropis) {
//
//				if (s.length() == 3 && s.charAt(0) == 'A') {
//					System.out.println(s);
//				}
//			}
//		};
//
//		c.filtrar();
//
//	}

//	public void filtrar(ArrayList<String> nomsPropis) {
//
//		
//
//		for (String s : nomsPropis) {
//
//			if (s.length() == 3 && s.charAt(0) == 'A') {
//				System.out.println(s);
//			}
//		}
//
