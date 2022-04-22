package n1exercici5;

import java.util.*;

//Exercici 5. Crea i empleni un objecte List<Integer>. Crea i empleni un segon objecte 
//List<Integer> de la mateixa grandària que el primer. Utilitzi sengles objectes 
//ListIterator per a llegir els elements de la primera llista i inserir-los en la segona 
//en ordre invers (provi d'explorar diverses formes diferents de resoldre aquest problema).

public class Principal {

	public static void main(String[] args) {

		List<Integer> myList1 = new ArrayList<Integer>();

		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		myList1.add(4);
		myList1.add(5);

		List<Integer> myList2 = new ArrayList<Integer>();

		myList2.add(6);
		myList2.add(7);
		myList2.add(8);
		myList2.add(9);
		myList2.add(10);

		Iterator<Integer> it1 = myList1.iterator();
//		Iterator<Integer> it2 = myList2.iterator();

		Collections.reverse(myList1);

		while (it1.hasNext()) {
			Integer n = it1.next();
//			for (int i = myList1.size(); i > 0; i--) {
			myList2.add(n);

		}
		System.out.println(myList2);
	}

}
