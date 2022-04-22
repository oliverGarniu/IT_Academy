package n1exercici6;

import java.util.*;

//Exercici 6. Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador 
//ListIterator, afegeixi valors sencers a la llista inserint-los sempre a la 
//meitat d'aquesta.

public class Principal {

	public static void main(String[] args) {

		LinkedList<Integer> myNum = new LinkedList<Integer>();
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		n.add(myNum.size()/2, 1);
		n.add(myNum.size()/2, 2);
		n.add(myNum.size()/2, 3);
		n.add(myNum.size()/2, 4);
		n.add(myNum.size()/2, 5);
		n.add(myNum.size()/2, 6);
		
		Iterator<Integer> it = n.listIterator();
		
		while (it.hasNext()) {
			myNum.add(it.next());
		}
		System.out.println(myNum);
	}

}
