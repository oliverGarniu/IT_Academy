package n1exercici3;

//Exercici 3. Executi l'exercici anterior guardant a un fitxer txt el resultat.

import java.io.File;
import java.text.SimpleDateFormat;

public class FitxerText {

	public static void main(String[] args) {

		File file = new File("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori");

		printDir(file, 0);

	}

	private static void printDir(File file, int value) {

		File[] arxius = file.listFiles();
		if (arxius == null || arxius.length == 0) {
			System.out.println("No hi ha cap element al directori");
			return;
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			for (int i = 0; i < arxius.length; i++) {
				File arxiu = arxius[i];
				System.out.println(String.format("%s (%s) - %d - %s", arxiu.getName(), arxiu.isDirectory() ? "D" : "F",
						arxiu.length(), sdf.format(arxiu.lastModified())));
			}
		}

	}
}
