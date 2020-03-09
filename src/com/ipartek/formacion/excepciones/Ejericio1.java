package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejericio1 {
	/**
	 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
	 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
	 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
	 * el programa. Añada excepciones para recoger estas excepciones y avisar del
	 * problema al usuario
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Introduce el primer numero: ");
			a = Integer.parseInt(sc.nextLine());
			System.out.print("\nIntroduce el segundo numero: ");
			b = Integer.parseInt(sc.nextLine());
			System.out.println("\nLa division entre los dos numeros es: " + a / b);

		} catch (NumberFormatException e) {
			System.out.println("Error, no se han introducido numeros");
		} catch (ArithmeticException e) {

			System.out.println("Error, se está dividiendo entre 0");
		}
		sc.close();

	}

}
