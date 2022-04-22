package n1exercici3;

import java.util.ArrayList;

//Exercici 3. Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. 
//Verifica el seu correcte funcionament amb un test jUnit.

public class ArrayIndexOutOfBounds {

	public void arrayIndex() {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);

		try {
			num.get(7);

		} catch (Exception e) {
			System.out.println("Wrong");

		}

	}


}
