package n1exercici4;

import java.util.*;

//Exercici 4. Escriu un ḿetode public static <T> void iterCollection (Collection<T> c) 
//que utilitzi un iterador per a recórrer una col·lecció genèrica passada per argument i 
//imprimeixi tots els seus objectes (fent servir el mètode toString()). Empleni tots els 
//diferents tipus de Java Collections (ArrayList, LinkedList, HashSet, LinkedHashSet i 
//TreeSet), amb una sèrie d'objectes i apliqui el mètode dissenyat a cada Contenidor.

public class Principal {

	public static void main(String[] args) {

		genArrayList();
		genLinkedList();
		genLinkedList();
		genHashSet();
		genLinkedHashSet();
		genTreeSet();

	}

	public static <T> void iterCollection(Collection<T> personatges) {

		Iterator<T> it = personatges.iterator();

		System.out.println("********************");

		while (it.hasNext()) {
			T p = it.next();
			System.out.println(p.toString());
		}
		System.out.println("====================");
	}

	public static void genArrayList() {

		ArrayList<String> personatges = new ArrayList<String>();

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

		iterCollection(personatges);

	}

	public static void genLinkedList() {

		LinkedList<String> personatges = new LinkedList<String>();

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

		iterCollection(personatges);

	}

	public static void genHashSet() {

		HashSet<String> personatges = new HashSet<String>();

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

		iterCollection(personatges);

	}

	public static void genLinkedHashSet() {

		LinkedHashSet<String> personatges = new LinkedHashSet<String>();

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

		iterCollection(personatges);

	}

	public static void genTreeSet() {

		TreeSet<String> personatges = new TreeSet<String>();

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

		iterCollection(personatges);

	}
}
