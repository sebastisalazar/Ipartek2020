package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * Recorrer paises y preguntar si existe algun caso de Corona Virus <br>
 * -En caso afirmativo preguntar numero de infectados
 * 
 * Finalmente <br>
 * - mostrar paises libres de coronavirus <br>
 * - mostrar paises infectados junto con su numero de casos - mostrar el numero
 * - total de personas infectadas
 * 
 *
 */

public class PaisesCoronaVirus {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Repulica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };
		int totalinfectados = 0;
		String resp;
		Scanner sc = new Scanner(System.in);

		// RECORRE PAISES PREGUNTADO POR INFECTADOS
		for (int i = 0; i < PAISES.length; i++) {

			System.out.print("¿Existen personas infectadas por el virus en " + PAISES[i] + " ? (s/n): ");

			resp = sc.nextLine();

			// valdría resp.equalsIgnoreCase("s") pero es mejor poner una constante
			if ("s".equalsIgnoreCase(resp)) {

				// Actualiza el array de paisesInfectados

				paisesInfectados[i] = true;
				System.out.print("Indica el numero de infectados: ");

				// Actualiza el array de numeroInfectados

				numeroInfectados[i] = Integer.parseInt(sc.nextLine());

			} // FIN IF

			System.out.println(" \n*************************************************\n");

		} // FIN FOR

		// PAISES LIBRE DE CORONA VIRUS

		System.out.println("\n*****************************\n");
		System.out.println("\tESTADISTICA");
		System.out.println("\n*****************************\n");
		System.out.println("PAISES LIBRE DE CORONA VIRUS\n ");

		for (int i = 0; i < paisesInfectados.length; i++) {

			if (!paisesInfectados[i]) {
				System.out.println("- " + PAISES[i]);
			} // FIN IF
		} // FIN FOR

		// PAISES INFECTADOS
		System.out.println("\n*****************************\n");
		System.out.println("PAISES INFECTADOS + NÚMERO DE INFECTADOS\n ");
		for (int i = 0; i < paisesInfectados.length; i++) {

			if (paisesInfectados[i]) {
				System.out.println("- " + PAISES[i] + ", número de infectados: " + numeroInfectados[i]);
			} // FIN IF

			totalinfectados += numeroInfectados[i];
		} // FIN FOR

		System.out.println("\n*****************************\n");
		System.out.println("Total infectados entre los " + (PAISES.length - 1) + " paises: " + totalinfectados);

		System.out.println(" ");
		sc.close();

		// PAISES INFECTADOS CON CASOS SUPERIORES A 2
		System.out.println("\n*****************************\n");
		System.out.println("PAISES INFECTADOS + NÚMERO DE INFECTADOS SUPERIOR A 2\n ");
		for (int i = 0; i < numeroInfectados.length; i++) {

			if (numeroInfectados[i] > 2) {
				System.out.println("- " + PAISES[i] + ", número de infectados: " + numeroInfectados[i]);
			} // FIN IF

			totalinfectados += numeroInfectados[i];
		} // FIN FOR

	}// fin main

}
