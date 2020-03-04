package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio13 {

	/**
	 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
	 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
	 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
	 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
	 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
	 * 28 N�mero de la suerte: 28
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dia, mes, anio, suerte, suma, cifra1, cifra2, cifra3, cifra4;
		System.out.println("Introduzca fecha de nacimiento");
		System.out.print("d�a: ");
		dia = sc.nextInt();
		System.out.print("mes: ");
		mes = sc.nextInt();
		System.out.print("a�o: ");
		anio = sc.nextInt();
		suma = dia + mes + anio;
		cifra1 = suma / 1000; // obtiene la primera cifra
		cifra2 = suma / 100 % 10; // obtiene la segunda cifra
		cifra3 = suma / 10 % 10; // obtiene la tercera cifra
		cifra4 = suma % 10; // obtiene la �ltima cifra
		suerte = cifra1 + cifra2 + cifra3 + cifra4;
		System.out.println("Su n�mero de la suerte es: " + suerte);

		sc.close();
	}

}
