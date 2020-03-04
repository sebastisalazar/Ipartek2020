package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/**
		 * Programa que lee por teclado el valor del radio de una circunferencia y
		 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
		 * 
		 * Longitud de la circunferencia = 2*PI*Radio, <br>
		 * Area de la circunferencia , PI*Radio^2
		 */

		double radio;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el radio de la circunferencia:");
		radio = sc.nextDouble();

		System.out.println("La longitud de la circunferencia es: " + (2 * Math.PI * radio));
		System.out.println("El area de la circunferencia es: " + Math.PI * Math.pow(radio, 2));
		sc.close();

	}// fin main

}// fin clase
