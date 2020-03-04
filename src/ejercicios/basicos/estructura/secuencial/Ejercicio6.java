package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio6 {

	/**
	 * Ejercicio 6. <br>
	 * <br>
	 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
	 * teclado.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double velocidad;
		System.out.print("Velocidad en km/h: ");
		velocidad = sc.nextDouble();

		System.out.println("Velocidad pasada a m/s: " + velocidad * 1000 / 3600);
		sc.close();

	}

}
