package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * Ejercicio 7. Programa lea la longitud de los catetos de un triángulo
		 * rectángulo y calcule la longitud de la hipotenusa según el teorema de
		 * Pitágoras.
		 */

		double c1, c2;
		Scanner sc = new Scanner(System.in);

		System.out.print("introduce el cateto 1: ");
		c1 = sc.nextDouble();
		System.out.print("introduce el cateto 2: ");
		c2 = sc.nextDouble();
		System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2)));

		sc.close();

	}

}
