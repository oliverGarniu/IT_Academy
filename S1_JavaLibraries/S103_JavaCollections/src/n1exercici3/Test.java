package n1exercici3;

//Exercici 3. Crea una classe anomenada Generadora que retorni noms de personatges 
//(com String) de la seva pel·lícula favorita cada que vegada que invoqui al mètode 
//'seguentPersonatge()', i que torni al principi de la llista de personatges una vegada 
//que hagi acabat amb tots els noms. Utilitzi aquest generador per a emplenar un 
//ArrayList, un LinkedList, un HashSet, un LinkedHashSet i un TreeSet, i després 
//imprimeixi per pantalla cada contenidor. Quins contenidors permeten elements repetits? 
//Quins contenidors permeten una ordenació per ordre natural o alfanumèric?

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		genArrayList();       //Si permet elements repetits, els elements es troben en l´ordre que s´afegeixen.
		genLinkedList();      //Si permet elements repetits, els elements es troben en l´ordre que s´afegeixen.
		genHashSet();         //No permet elements repetits, sense ordre específic.
		genLinkedHashSet();   //No permet elements repetits, els elements es troben en l´ordre que s´afegeixen.
		genTreeSet();         //No permet elements repetits, els elements es troben en ordre natural o alfanumèric.

	}

	public static void genArrayList() {

		ArrayList<String> personatges = new ArrayList<String>();

		Generadora g = new Generadora();
		g.reset();
		String p = g.next();
		while (p != null) {
			personatges.add(p);
			p = g.next();
		}

		System.out.println("**ArrayList**");
		for (String s : personatges) {
			System.out.println(s);
		}
		System.out.println("====================");
	}

	public static void genLinkedList() {

		LinkedList<String> personatges = new LinkedList<String>();

		Generadora g = new Generadora();
		g.reset();
		String p = g.next();
		while (p != null) {
			personatges.add(p);
			p = g.next();
		}

		System.out.println("**LinkedList**");
		for (String s : personatges) {
			System.out.println(s);
		}
		System.out.println("====================");

	}

	public static void genHashSet() {

		HashSet<String> personatges = new HashSet<String>();

		Generadora g = new Generadora();
		g.reset();
		String p = g.next();
		while (p != null) {
			personatges.add(p);
			p = g.next();
		}
		System.out.println("**HashSet**");
		for (String s : personatges) {
			System.out.println(s);
		}
		System.out.println("====================");

	}

	public static void genLinkedHashSet() {

		LinkedHashSet<String> personatges = new LinkedHashSet<String>();

		Generadora g = new Generadora();
		g.reset();
		String p = g.next();
		while (p != null) {
			personatges.add(p);
			p = g.next();
		}
		System.out.println("**LinkedHashSet**");
		for (String s : personatges) {
			System.out.println(s);
		}
		System.out.println("====================");

	}

	public static void genTreeSet() {

		TreeSet<String> personatges = new TreeSet<String>();

		Generadora g = new Generadora();
		g.reset();
		String p = g.next();
		while (p != null) {
			personatges.add(p);
			p = g.next();
		}
		System.out.println("**TreeSet**");
		for (String s : personatges) {
			System.out.println(s);
		}
		System.out.println("====================");

	}
}
