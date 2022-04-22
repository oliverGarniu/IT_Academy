package n1exercici1_2;

import java.util.ArrayList;

//Escriu un mètode que retorne una cadena separada per comes basada en una llista 
//d’Integers. Cada element  hauria d'anar precedit per la lletra  "e" si el nombre és 
//parell , i precedit de la lletra  "o" si el nombre és imparell. Per exemple, si la 
//llista  d'entrada és (3,44), la  sortida hauria de ser "o3, e44". Imprimeix el  resultat. 

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(12);
		num.add(35);
		num.add(14);
		num.add(77);
		num.add(16);
		num.add(5);

		num.stream().filter(c -> c % 2 == 0).forEach(c -> System.out.print("e" + c + ", "));
		num.stream().filter(c -> c % 2 != 0).forEach(c -> System.out.print("o" + c + ", "));

	}
}

//		Cadena c = () -> {
//
//			for (Integer s : num) {
//
//				if (s % 2 == 0) {
//
//					System.out.print("e" + s + ", ");
//
//				} else {
//
//					System.out.print("o" + s + ", ");
//				}
//
//			}
//
//		};
//
//		c.filtrar();
//
//	}

//	public void filtrar(ArrayList<Integer> num) {
//
//		for (Integer s : num) {
//
//			if (s % 2 == 0) {
//
//				System.out.print("e" + s + ", ");
//
//			} else {
//
//				System.out.print("o" + s + ", ");
//			}
//
//		}
//
//	}
