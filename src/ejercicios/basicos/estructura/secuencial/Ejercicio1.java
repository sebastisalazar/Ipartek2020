package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio1 {

	// 1. Programa Java que lea dos n�meros enteros por teclado y los muestre por
	// pantalla.

	public static void main(String[] args) {

		int n1 = 0, n2 = 0;
		Scanner sc = new Scanner(System.in);

		// lee el primer numero introducido
		System.out.println("Introduce el primer n�mero:");
		n1 = sc.nextInt();

		// lee el segundo numero introducido
		System.out.println("Introduce el primer n�mero:");
		n2 = sc.nextInt();

		// cierre del escanner para que no quede abierto
		sc.close();

		// Mensaje para mostrar los numeros introducidos
		System.out.println("Los numeros introducidos son " + n1 + " y " + n2);

	}

}
