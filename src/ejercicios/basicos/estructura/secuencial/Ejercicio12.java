package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio12 {

	/**
	 * PIDE LO MISMO QUE EN EL EJERCICIO 11 Programa Java que lea un número entero N
	 * de 5 cifras y muestre sus cifras igual que en el ejemplo. Por ejemplo para un
	 * número N = 12345 La salida debe ser:
	 * 
	 * 5<br>
	 * 45<br>
	 * 345<br>
	 * 2345<br>
	 * 12345<br>
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

		System.out.println(n % 10);
		System.out.printf("%02d %n", n % 100);
		System.out.printf("%03d %n", n % 1000);
		System.out.printf("%04d %n", n % 10000);
		System.out.printf("%05d %n", n);

		sc.close();

	}

}
