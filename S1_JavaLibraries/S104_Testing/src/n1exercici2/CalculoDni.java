package n1exercici2;

//Exercici 2. Crea una classe anomenada CalculoDni que calculi la lletra del DNI en 
//rebre el número com a paràmetre. Crea una classe jUnit que verifiqui el seu correcte 
//funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i 
//validi si el càlcul és correcte per a 10 números de DNI predefinits.

public class CalculoDni {

	public static void comprobarLetraDni(int dni) {

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		char letraCalculada = letras[dni % 23];

		System.out.println(letraCalculada);

	}
}
