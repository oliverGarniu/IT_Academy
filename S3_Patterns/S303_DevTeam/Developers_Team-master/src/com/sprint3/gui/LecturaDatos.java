package com.sprint3.gui;



import java.util.Scanner;

/**
 * @author ALBERTO
 */
public class LecturaDatos {
	
	/**
	 * M�todo que se encarga de leer linea de texto que aparece en consola.
	 * @return String
	 */
	public static String leerLinea() {
		return new Scanner(System.in).nextLine();
	}

	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerLinea()
	 */
	public static String leerLinea(String mensaje) {
		System.out.println(mensaje);
		return leerLinea();
	}
	/**
	 * M�todo que se encarga de leer un int que aparece en consola.
	 * @return int
	 */
	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerInt()
	 */
	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		return leerInt();
	}
	/**
	 * M�todo que se encarga de leer un short que aparece en consola.
	 * @return short
	 */
	public static short leerShort() {
		return new Scanner(System.in).nextShort();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerShort()
	 */
	public static short leerShort(String mensaje) {
		System.out.println(mensaje);
		return leerShort();
	}
	/**
	 * M�todo que se encarga de leer un float que aparece en consola.
	 * @return float
	 */
	public static float leerFloat() {
		return new Scanner(System.in).nextFloat();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerFloat()
	 */
	public static float leerFloat(String mensaje) {
		System.out.println(mensaje);
		return leerFloat();
	}
	/**
	 * M�todo que se encarga de leer un long que aparece en consola.
	 * @return long
	 */
	public static long leerLong() {
		return new Scanner(System.in).nextLong();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerLong()
	 */
	public static long leerLong(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextLong();
	}
	/**
	 * M�todo que se encarga de leer un double que aparece en consola.
	 * @return double
	 */
	public static double leerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerDouble()
	 */
	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}
	/**
	 * M�todo que se encarga de leer un Byte que aparece en consola.
	 * @return Byte
	 */
	public static byte leerByte() {
		return new Scanner(System.in).nextByte();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerByte()
	 */
	public static byte leerByte(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextByte();
	}
	/**
	 * M�todo que se encarga de leer la palabra que aparece en consola.
	 * @return String
	 */
	public static String leerPalabra() {
		return new Scanner(System.in).next();
	}
	/**
	 * M�todo que imprime en consola el texto introducido como par�metro.
	 * @param mensaje
	 * @return leerPalabra()
	 */
	public static String leerPalabra(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).next();
	}


}