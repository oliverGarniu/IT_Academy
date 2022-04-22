package n1exercici5;

//Exercici 5. Defineix un comportament "erroni" utilitzant un bucle 'while' que es 
//repeteixi fins que es deixi de generar una excepció. Per exemple es pot utilitzar 
//un bucle el qual no finalitza fins que no s'han introduit  5 numeros.

public class Bucle {

	public static void main(String[] args) {

		int i = 1;
		boolean positiu = false;

		while (!positiu) {

			int resultat = i - 4;
			System.out.println("El resultat és: " + resultat);

			try {
				if (resultat > 0) {
					System.out.println("El número és positiu");
					positiu = true;

				} else {
					throw new MyException();
				}

			} catch (MyException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			} finally {
				System.out.println("Acció finalitzada");

			}
			i++;

		}

	}

}
