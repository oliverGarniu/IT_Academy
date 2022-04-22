package n1exercici4;

//Exercici 4. Crea la teva pròpia classe d'excepcions, heretant de la classe Exception. 
//Utilitza el constructor d'aquesta classe per emmagatzemar dins Exception, el missatge 
//personalitzat que farà servir aquesta excepció. Crea una clàusula try-catch per a provar 
//la nova excepció. Captura i mostra el missatge emmagatzemat. Mostra també la classe de 
//l'excepció.

public class Test {

	public static void main(String[] args) {

		int num1, num2;

		num1 = 107;
		num2 = 53;

		try {

			float resultat = (float) num1 / num2;

			if ((num1 <= 0 || num1 >= 100) || (num2 <= 0 || num2 >= 100)) {
				throw new MyException(num1, num2);

			} else {
				System.out.println("El resultat de la divisió és " + resultat);
			}
			
		} catch (MyException e) {
			System.out.println(e);
			System.out.println(e.getMessage()); //missatge error de l´excepció
			e.printStackTrace(); //excepció + número linia
//			System.out.println(e.toString()); //nom excepció
			
		} finally {
			System.out.println("Acció finalitzada");
		}

	}
}
