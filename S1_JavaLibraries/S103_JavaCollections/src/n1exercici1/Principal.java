package n1exercici1;

import java.util.ArrayList;


//Exercici 1. Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el 
//nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) 
//en un Contenidor ArrayList Java, a excepció de l'objecte amb atribut "Agost". Després, 
//efectuï la inserció en el lloc que correspon a aquest mes i demostri que el Contenidor 
//manté l'ordre correcte.

public class Principal {

	public static void main(String[] args) {

		ArrayList<Month> mesosAny = new ArrayList<Month>();
		
	
		Month month1 = new Month("Gener");
		mesosAny.add(month1);
		Month month2 = new Month("Febrer");
		mesosAny.add(month2);
		Month month3 = new Month("Març");
		mesosAny.add(month3);
		Month month4 = new Month("Abril");
		mesosAny.add(month4);
		Month month5 = new Month("Maig");
		mesosAny.add(month5);
		Month month6 = new Month("Juny");
		mesosAny.add(month6);
		Month month7 = new Month("Juliol");
		mesosAny.add(month7);
		Month month9 = new Month("Setembre");
		mesosAny.add(month9);
		Month month10 = new Month("Octubre");
		mesosAny.add(month10);
		Month month11 = new Month("Novembre");
		mesosAny.add(month11);
		Month month12 = new Month("Decembre");
		mesosAny.add(month12);
		
		System.out.println(mesosAny);
		
		Month month8 = new Month("Agost");
		mesosAny.add(7, month8); //afegim el mes d´agost a la posició 7
		
		System.out.println(mesosAny);

	}

}
