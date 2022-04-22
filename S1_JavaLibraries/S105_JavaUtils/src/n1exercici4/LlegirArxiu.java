package n1exercici4;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.text.SimpleDateFormat;

//Exercici 4. Afegeixi la funcionalitat de llegir qualsevol fitxer txt i mostrar per 
//consola el seu contingut.

public class LlegirArxiu {

	public static void main(String[] args) {

//		File file = new File("C:/Users/carlos/Desktop/Eclipse - Java/Eclipse/S105/directori");
//
//		printDir(file, 0);

		LlegirArxiu arxiu = new LlegirArxiu();
		arxiu.llegirArxiu();

	}

//	public static void printDir(File file, int value) {
//
//		File[] arxius = file.listFiles();
//		if (arxius == null || arxius.length == 0) {
//			System.out.println("No hi ha cap element al directori");
//			return;
//		} else {
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//			for (int i = 0; i < arxius.length; i++) {
//				File arxiu = arxius[i];
//				System.out.println(String.format("%s (%s) - %d - %s", arxiu.getName(), arxiu.isDirectory() ? "D" : "F",
//						arxiu.length(), sdf.format(arxiu.lastModified())));
//			}
//		}
//
//	}

	public void llegirArxiu() {
		
		System.out.println("Ara mostrarem el contingut de l´arxiu: \n");

		{

			try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/carlos/Desktop\\Eclipse - Java/Eclipse/S105/directori/Prova.txt"))) {
				String s;
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
