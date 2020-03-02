package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * 
 * Ejerciciopara pedir 3 numeros por pantalla y sacar la media
 *
 */

public class MediaNumerosBucle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		float numero, total = 0;
		float contador = 0;

		do {

			System.out.println("Escribe un número:");
			numero = Float.parseFloat(sc.nextLine());
			total += numero;

			// preguntar si quiere terminar
			System.out.println("¿Quieres terminar? escribe 'si': ");
			String linea = sc.nextLine();

			if (linea.equalsIgnoreCase("si")) {
				continuar = false;
			}

			contador++;

		} while (continuar);

		System.out.println("El total es " + total);
		System.out.println("La media es " + (total / contador));
		sc.close();

	}

}
