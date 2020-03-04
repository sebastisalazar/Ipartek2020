package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/**
		 * Ejercicio 8:Programa que tome como dato de entrada un número que corresponde
		 * a la longitud del radio una esfera y nos calcula y escribe el volumen de la
		 * esfera que se corresponden con dicho radio.
		 * 
		 * La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3
		 */

		double radio;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el radio: ");
		radio = sc.nextDouble();

		System.out.println("Volumen correspondiente al radio es: " + (4.0 / 3) * Math.PI * Math.pow(radio, 3));
		sc.close();

	}

}
