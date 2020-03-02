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

		for (int i = 0; i < Paises.length; i++) {

			System.out.print(Paises[i]);
			System.out.print("¿Existen personas infectadas por el virus? (s/n)");
		}

		Scanner sc = new Scanner(System.in);
		sc.close();

	}// fin main

}
