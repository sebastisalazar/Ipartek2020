package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a
		 * fahrenheit es: F = 32 + ( 9 * C / 5)
		 */

		System.out.println("Introduce los grados centígrados: ");
		int gradosC = 0;
		Scanner sc = new Scanner(System.in);
		gradosC = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.println(
				"La conversion de " + gradosC + " cº" + " a Farenheit es: " + ConversionFarenheit(gradosC) + " F");

	}// fin main

	public static int ConversionFarenheit(int gradosC) {
		int f = 32 + (9 * gradosC / 5);
		return f;
	}

}// fin clase
