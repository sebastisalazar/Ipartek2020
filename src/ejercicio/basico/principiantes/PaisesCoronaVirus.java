package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * Recorrer paises y preguntar si existe algun caso de Corona Virus <br>
 * -En caso afirmativo preguntar numero de infectados
 * 
 * Finalmente <br>
 * - mostrar paises libres de coronavirus <br>
 * - mostrar paises infectados junto con su numero de casos - mostrar el numero
 * total de personas infectadas
 * 
 *
 */

public class PaisesCoronaVirus {

	public static void main(String[] args) {

		final String[] Paises = { "Noruega", "Alemania", "Repulica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };
		String resp;
		Scanner sc = new Scanner(System.in);

		// RECORRE PAISES PREGUNTADO POR INFECTADOS
		for (int i = 0; i < Paises.length; i++) {

			System.out.print(Paises[i]);
			System.out.print("¿Existen personas infectadas por el virus? (s/n)");

			resp = sc.nextLine();

			if (resp.equalsIgnoreCase("s")) {

				paisesInfectados[i] = true;
				System.out.println("Indica el numero de infectados: ");
				numeroInfectados[i] = Integer.parseInt(sc.nextLine());

			} // FIN IF

		} // FIN FOR

		// PAISES LIBRE DE CORONA VIRUS
		System.out.println("PAISES LIBRE DE CORONA VIRUS ");
		for (int i = 0; i < paisesInfectados.length; i++) {

			if (paisesInfectados[i] == false) {
				System.out.println("- " + Paises[i]);
			}
		} // FIN FOR

		// PAISES INFECTADOS
		for (int i = 0; i < paisesInfectados.length; i++) {

			if (paisesInfectados[i] == false) {
				System.out.println("- " + Paises[i]);
			}
		}

		System.out.println("");
		sc.close();

	}// fin main

}
