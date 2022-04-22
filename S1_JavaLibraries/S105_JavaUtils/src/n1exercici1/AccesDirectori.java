package n1exercici1;

//Exercici 1. Crea una classe Java que llisti el contingut d'un directori rebut per 
//paràmetre ordenat alfabèticament.

import java.io.File;

public class AccesDirectori {

	public static void main(String[] args) {

		File ruta = new File("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori");

		System.out.println(ruta.getAbsolutePath() + "\n"); 

		String[] arxiusCarpetes = ruta.list();

		for (int i = 0; i < arxiusCarpetes.length; i++) {

			System.out.println(arxiusCarpetes[i]);
		}

	}
}
