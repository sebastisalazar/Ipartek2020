package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		String s = "La lluvia en Sevilla no es una maravilla";
		Scanner sc = new Scanner(System.in);
		int n;
		boolean continuar = false;
		do {
			// capturar Excepciones
			try {
				// mostrar la frase por pantalla
				System.out.println("Frase: " + s);
				// pedir posicion
				System.out.println("Escribe la posicion: ");
				n = Integer.parseInt(sc.nextLine());
				System.out.println(letraDeLaPosicion(s, n));
				continuar = true;
			} catch (NullPointerException e) {
				System.out.println("Error, el String es null");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!continuar);
		sc.close();
	}

	/**
	 * Conseguimos la letra de la posicion indicada de la frase
	 * 
	 * @param frase    String
	 * @param posicion int
	 * @return char letra de la posicion indicada de la frase
	 */
	static char letraDeLaPosicion(String frase, int posicion) throws Exception {
		char[] n = frase.toCharArray();

		if (posicion > n.length) {
			throw new Exception("Error, posicion fuera de rango");
		} else {
			return frase.charAt(posicion);
		}

	}

}
