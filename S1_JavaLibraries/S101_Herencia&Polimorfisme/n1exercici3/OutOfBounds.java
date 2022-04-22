package n1exercici3;

//Exercici 3. Escriu el codi per a generar i capturar una excepció de tipus 
//ArrayIndexOutOfBoundsException. Per què Java no convida a capturar aquesta 
//excepció en temps de disseny? 

public class OutOfBounds {

	public static void main(String[] args) {

		int[] myNum = {10, 12, 14, 16, 18, 20};

		try {
			if (myNum[6] == 20) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("L´array myNum arriba fins a la posició 5, tot i tenir una longitud de 6.");

		} finally {
			System.out.println("Acció finalitzada");

		}

		// En aquest cas estariem parlant d´una "Runtime Exception" (unchecked),
		// error que es dóna en temps d´execució.

	}

}
