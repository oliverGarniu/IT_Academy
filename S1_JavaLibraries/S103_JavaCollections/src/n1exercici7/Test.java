package n1exercici7;

import java.util.*;

//Exercici 7. Empleni un HashMap amb parelles clau-valor. Ordeni les parelles segons el 
//codi hash i imprimeixi el resultat (Idea: fer servir un TreeMap). Extregui les parelles 
//ordenades i introdueixi-les en un mapa LinkedHashMap (Idea: fer servir el seu constructor). 
//Demostri que es manté l'ordre d'inserció. Extregui només les claus ordenades i introdueixi-les 
//primer en un HashSet i després en un LinkedHashSet. Es manté l'ordre?

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		// Afegim claus i valors (Provincia, numHabitants)
		hMap.put("Barcelona", 5690752);
		hMap.put("Tarragona", 821548);
		hMap.put("Lleida", 435186);
		hMap.put("Girona", 769274);

		System.out.println("\n**HashMap**");

		for (String i : hMap.keySet())
			System.out.println("Clau: " + i + " --- Valor: " + hMap.get(i));

		TreeMap<String, Integer> tMap = new TreeMap<String, Integer>();
//		TreeMap<String, Integer> tMap = new TreeMap<String, Integer>(hMap);
		tMap.putAll(hMap);

		System.out.println("\n**TreeMap**");

		for (String i : tMap.keySet())
			System.out.println("Clau: " + i + " --- Valor: " + tMap.get(i));

		LinkedHashMap<String, Integer> lhM = new LinkedHashMap<String, Integer>(tMap);

		System.out.println("\n**LinkedHashMap**"); // es manté l´ordre

		for (String i : lhM.keySet())
			System.out.println("Clau: " + i + " --- Valor: " + lhM.get(i));

		// Extraurem les claus ordenades del TreeMap per passar-les a HashSet i
		// LinkedHashSet

		System.out.println("\n**HashSet i LinkedHashSet**");

		Set<String> keys = tMap.keySet();
		System.out.println("Ordre del TreeMap " + keys);

		HashSet<String> hSet = new HashSet<String>(keys); //No manté l´ordre

		System.out.println("Ordre HashSet " + hSet);

		LinkedHashSet<String> lhSet = new LinkedHashSet<String>(keys); //Si manté l´ordre

		System.out.println("Ordre LinkedHashSet " + lhSet);

	}

}
