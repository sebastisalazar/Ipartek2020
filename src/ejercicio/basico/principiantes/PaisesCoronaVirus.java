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

		final String[] Paises = { "Noruega", "Alemania", "Repulica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };
		int totalinfectados = 0;
		String resp;
		Scanner sc = new Scanner(System.in);

		// RECORRE PAISES PREGUNTADO POR INFECTADOS
		for (int i = 0; i < Paises.length; i++) {

			System.out.println(Paises[i]);
			System.out.print("¿Existen personas infectadas por el virus? (s/n): ");

			resp = sc.nextLine();

			if (resp.equalsIgnoreCase("s")) {

				paisesInfectados[i] = true;
				System.out.print("Indica el numero de infectados: ");
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

			if (paisesInfectados[i] == false) {
				System.out.println("- " + Paises[i]);
			} // FIN IF
		} // FIN FOR

		// PAISES INFECTADOS
		System.out.println("\n*****************************\n");
		System.out.println("PAISES INFECTADOS + NÚMERO DE INFECTADOS\n ");
		for (int i = 0; i < paisesInfectados.length; i++) {

			if (paisesInfectados[i] == true) {
				System.out.println("- " + Paises[i] + ", número de infectados: " + numeroInfectados[i]);
			} // FIN IF

			totalinfectados += numeroInfectados[i];
		} // FIN FOR

		System.out.println("\n*****************************\n");
		System.out.println("Total infectados entre los " + (Paises.length - 1) + " paises: " + totalinfectados);

		System.out.println(" ");
		sc.close();

	}// fin main

}
