package n1exercici1_3;

import java.util.ArrayList;

//Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les  
//cadenes  que continguen la lletra ‘o’ i  imprimeix el resultat. 

public class Test {

	public static void main(String[] args) {

		ArrayList<String> nomsPropis = new ArrayList<String>();

		nomsPropis.add("Josep");
		nomsPropis.add("Ali");
		nomsPropis.add("Carlos");
		nomsPropis.add("Emma");
		nomsPropis.add("Ann");
		nomsPropis.add("Arnau");
		
		nomsPropis.stream().filter(c -> c.contains("o") ).forEach(c -> System.out.println(c));

	}
}

//		Cadena c = () -> {
//
//			for (String s : nomsPropis) {
//				for (int i = 0; i < s.length(); i++) {
//					if (s.charAt(i) == 'o') {
//						System.out.println(s);
//					}
//				}
//
//			}
//		};
//
//		c.filtrar();
//
//	}

//	public void filtrar(ArrayList<String> nomsPropis) {
//
//		for (String s : nomsPropis) {
//			for (int i = 0; i < s.length(); i++) {
//				if (s.charAt(i) == 'o') {
//					System.out.println(s);
//				}
//			}
//
//		}
//	}
