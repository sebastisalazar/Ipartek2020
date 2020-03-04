package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
	 * que en el ejemplo. Por ejemplo para un número N = 12345 La salida debe ser:
	 * 1<br>
	 * 12<br>
	 * 123<br>
	 * 1234<br>
	 * 12345
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int n;
		boolean valido = false;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Introduce el número de 5 cifras: ");
			n = Integer.parseInt(sc.nextLine());

			if (n < 10000 || n > 99999) {

				System.out.print("\nNo es un numero de 5 cifras, intentalo otra vez\n");
			} else {
				valido = true;
			}

		} while (!valido);

		System.out.println(n / 10000);
		System.out.println(n / 1000);
		System.out.println(n / 100);
		System.out.println(n / 10);
		System.out.println(n);

		sc.close();
	}
}
