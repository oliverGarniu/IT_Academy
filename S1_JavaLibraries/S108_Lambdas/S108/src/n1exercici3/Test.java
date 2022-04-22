package n1exercici3;

//Crea  una Functional Interface que conting a un mètode abstracte reverse (), 
//que retorn e un valor String; en una  altra classe,  injecta a la interfície  
//creada mitjançant una lambda el cos de l  mètode, de manera que torne la  mateixa 
//cadena que rep  com a paràmetre  però a l'inrevés. Invo ca la instància de la  
//interfície passant-li una cadena i  comprovant el resultat. 

public class Test {

	public static void main(String[] args) {

		Cadena c = () -> {
			String s = "Hola";
			String resultat = "";
			for (int i = s.length() - 1; i >= 0; i--)
				resultat += s.charAt(i);
			return resultat;

		};

		System.out.println(c.reverse());
	}

}
