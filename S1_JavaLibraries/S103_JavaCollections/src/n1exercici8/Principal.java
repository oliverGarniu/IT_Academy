package n1exercici8;

import java.util.*;
import java.util.Map.Entry;

//Exercici 8. Empleni un mapa LinkedHashMap amb claus de tipus String i objectes del 
//tipus que prefereixi. Extregui les parelles, ordeni-les segons les claus (en ordre 
//alfabètic) i torni a inserir-les en el mapa. Idea: Fes servir un ArrayList per 
//realitzar l'ordenació amb la classe Comparator.  

public class Principal {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhMap = new LinkedHashMap<String, String>();

		lhMap.put("USA", "New York");
		lhMap.put("Scotland", "Edinburgh");
		lhMap.put("Portugal", "Lisbon");
		lhMap.put("Holland", "Amsterdam");

		System.out.println("**Original LinkedHashMap(before sorting)**\n");
		Set<Entry<String, String>> entrades = lhMap.entrySet();

		for (Entry<String, String> e : entrades) {
			System.out.println(e.getKey() + " ==> " + e.getValue());
		}
		// Fem servir TreeMap perquè manté l´ordre alfabètic
		TreeMap<String, String> tMap = new TreeMap<String, String>(lhMap);

		Set<Entry<String, String>> mappings = tMap.entrySet();

		System.out.println("\n**LinkedHashMap en ordre alfabètic(claus)**\n");
		for (Entry<String, String> s : mappings) {
			System.out.println(s.getKey() + " ==> " + s.getValue());

		}
		/*System.out.println();
		for (String s : lhMap.keySet()) {
			System.out.println("Key: " + s + "--- Value: " + lhMap.get(s));

		}
		System.out.println("\nKey-Value pairs: " + lhMap.entrySet());

		ArrayList<String> aList1 = new ArrayList<String>(); // Key
		ArrayList<String> aList2 = new ArrayList<String>(); // Value

		System.out.println("\n**ArrayList**\n");

		for (Map.Entry<String, String> it : lhMap.entrySet()) {
			aList1.add(it.getKey());
			aList2.add(it.getValue());

		}
		System.out.print("Key -> ");
		System.out.println(aList1);
		System.out.print("Value -> ");
		System.out.println(aList2);*/

	}

}
