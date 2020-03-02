package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/**
		 * Escribe un programa Java que lee un número entero por teclado y obtiene y
		 * muestra por pantalla el doble y el triple de ese número.
		 * 
		 */

		int num = 0;
		System.out.println("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();

		System.out.println("El doble de " + num + " es: " + (num * 2));
		System.out.println("El triple de " + num + " es: " + (num * 3));

	}// fin main

}// fin clase
