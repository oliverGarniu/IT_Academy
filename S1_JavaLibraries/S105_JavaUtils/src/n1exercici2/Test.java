package n1exercici2;

//Exercici 2. Afegeixi a la classe del nivell anterior la funcionalitat de llistar un 
//arbre de directoris amb el contingut de tots els seus nivells (recursivamente) de 
//manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant 
//a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

import java.io.File;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) {

		File file = new File("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori");

		if (file != null) {

			printDir(file);

		}
	}

	private static void printDir(File file) {

		File[] arxius = file.listFiles();
		if (arxius == null || arxius.length == 0) {
			System.out.println("No hi ha cap element al directori");
			
		} else {
			SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			for (File arxiu : arxius) {
				if (arxiu.isDirectory()) {
					// Especifiquem el format que tindrà el nom de l´arxiu (nom arxiu(String: %s),
					// tipus arxiu(String: (%s)), tamany arxiu(int: %d), data darrera
					// modificació(String: %s")
					System.out.println(String.format("%s (%s) - %d - %s", arxiu.getName(),
							arxiu.isDirectory() ? "D" : "F", arxiu.length(), sDF.format(arxiu.lastModified())));
				} else {
					
					printDir(arxiu.getAbsoluteFile());
				}

			}
		}

	}
}
