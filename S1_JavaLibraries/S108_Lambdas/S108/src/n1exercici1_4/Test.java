package n1exercici1_4;

import java.util.ArrayList;

//Has de fer el mateix que en el punt anterior,  però retornant una llista que  incloga 
//els elements amb  més de 5 lletres. Imprimeix  el  resultat. 

public class Test {

	public static void main(String[] args) {

		ArrayList<String> nomsPropis = new ArrayList<String>();

		nomsPropis.add("Josep");
		nomsPropis.add("Ali");
		nomsPropis.add("Carlos");
		nomsPropis.add("Emma");
		nomsPropis.add("Ann");
		nomsPropis.add("Arnau");
		
		nomsPropis.stream().filter(c -> c.contains("o") && c.length() > 5).forEach(c -> System.out.println(c));

	}
}

//		Cadena c = () -> {
//
//			for (String s : nomsPropis) {
//				for (int i = 0; i < s.length(); i++) {
//					if (s.charAt(i) == 'o' && s.length() > 5) {
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
//		        if (s.charAt(i) == 'o' && s.length() > 5) {
//					System.out.println(s);
//				}
//			}
//
//		}
//	}
