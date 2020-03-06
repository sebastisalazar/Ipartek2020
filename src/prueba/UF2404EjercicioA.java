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

	public static void main(String[] args) {

		// Variables
		double[] notas = { 0, 0, 0, 0, 0 };
		double media = 0;
		double notamax = Double.MIN_VALUE;
		double notamin = Double.MAX_VALUE;
		Scanner sc = new Scanner(System.in);

		// Rellenando array (pedir notas)
		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota " + i + " : ");
			notas[i] = Double.parseDouble(sc.nextLine());
			media += notas[i];

			// Calculo nota max
			if (notas[i] > notamax) {
				notamax = notas[i];
			}

			// Calculo nota min
			if (notas[i] < notamin) {
				notamin = notas[i];
			}

		} // Fin for

		sc.close();// cierre el scanner

		// mensajes
		System.out.println("Nota mas alta: " + notamax);
		System.out.println("Nota mas baja: " + notamin);
		System.out.println("Media de todas las notas: " + (media / notas.length - 1));

	}// Fin main

}// Fin clase
