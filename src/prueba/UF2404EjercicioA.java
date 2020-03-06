package prueba;

import java.util.Scanner;

public class UF2404EjercicioA {

	/**
	 * Realizar un programa en java que realice la siguiente función: Crear un array
	 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
	 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
	 * contenido, se calculara la media de las notas así como se mostraran las notas
	 * más altas y más bajas de dicho array.
	 * 
	 * @param args
	 */

	// Variables globales
	static double[] notas = { 0, 0, 0, 0, 0 };
	static double sumamedia = 0;
	static double notamax = Double.MIN_VALUE;
	static double notamin = Double.MAX_VALUE;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		pedirNotas();
		calculoNotas();

		// mensajes
		System.out.println("Nota mas alta: " + notamax);
		System.out.println("Nota mas baja: " + notamin);
		System.out.println("Media de todas las notas: " + (sumamedia / notas.length - 1));

	}// Fin main

	// Rellenando array (pedir notas)
	static void pedirNotas() {
		boolean continuar = false;
		for (int i = 0; i < notas.length; i++) {

			do {// bucle para repetir si existe un error
				try {// control de errores
					System.out.print("Nota " + (i + 1) + " : ");
					notas[i] = Double.parseDouble(sc.nextLine());
					sumamedia += notas[i];
					continuar = true;
				} catch (NumberFormatException e) {
					System.out.println("Error, se ha introducido una letra en lugar de un numero");
					continuar = false;
				} // Fin try catch
			} while (!continuar);// Fin do while

		} // Fin for
	}// Fin pedir Notas

	// Calculo notas MAX y MIN

	static void calculoNotas() {
		for (int i = 0; i < notas.length; i++) {

			// Calculo nota max
			if (notas[i] > notamax) {
				notamax = notas[i];
			} // fin calculo nota max

			// Calculo nota min
			if (notas[i] < notamin) {
				notamin = notas[i];
			} // fin calculo nota min

		} // Fin For
	}// fin calculonotas

}// Fin clase
