package com.ipartek.formacion.excepciones;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Ejercicio 2 Realice un programa que nos solicite por teclado dos números, y
	 * leerlos usando la clase Scanner mediante la función nextLine(). Transformar
	 * ambos strings a números enteros usando la siguiente sentencia
	 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
	 * procesar para que no se produzca una interrupción y finalización del programa
	 * si alguno de los números leídos no puede convertirse, retomando el control en
	 * el punto del fallo, hasta que se solucione
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int n1 = 0, n2 = 0;

		System.out.print("Introduce el primer numero:");
		n1 = pedirnumero();
		System.out.print("Introduce el segundo numero");
		n2 = pedirnumero();

		System.out.println("La suma de " + n1 + " y " + n2 + " los numeros es: " + (n1 + n2));

	}

	static int pedirnumero() {
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			try {
				n = Integer.parseInt(sc.nextLine());
				continuar = true;
				return n;
			} catch (NumberFormatException e) {
				System.out.println("Error, no se ha introducido un numero");
				System.out.print("Vuelve a introducirlo: ");
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getCause());
			}
		} while (!continuar);

		sc.close();
		return n;
	}

}
