package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/**
		 * Programa Java que lea un número entero de 3 cifras y muestre por separado las
		 * cifras del número.
		 */

		int n;
		boolean valido = false;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Introduce el número de 3 cifras: ");
			n = Integer.parseInt(sc.nextLine());

			if (n < 100 || n > 999) {

				System.out.print("\nNo es un numero de 3 cifras, intentalo otra vez\n");
			} else {
				valido = true;
			}

		} while (!valido);

		System.out.println("\n\nPrimera cifra:" + n / 100);
		System.out.println("Segunda cifra:" + (n / 10) % 10);
		System.out.println("Tercera cifra:" + (n % 10));

		sc.close();
	}

}
