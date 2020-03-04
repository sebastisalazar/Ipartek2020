package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * Programa que lea una cantidad de grados cent�grados y la pase a grados
		 * Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados a
		 * fahrenheit es: F = 32 + ( 9 * C / 5)
		 */

		System.out.println("Introduce los grados cent�grados: ");
		int gradosC = 0;
		Scanner sc = new Scanner(System.in);
		gradosC = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.println(
				"La conversion de " + gradosC + " c�" + " a Farenheit es: " + ConversionFarenheit(gradosC) + " F");

	}// fin main

	public static int ConversionFarenheit(int gradosC) {
		int f = 32 + (9 * gradosC / 5);
		return f;
	}

}// fin clase
