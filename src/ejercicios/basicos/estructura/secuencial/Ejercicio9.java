package ejercicios.basicos.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/**
		 * Programa Java que calcule el área de un triángulo en función de las
		 * longitudes de sus lados (a, b, c), según la siguiente fórmula: Area =
		 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2 Para calcular la raíz
		 * cuadrada se utiliza el método Math.sqrt()
		 */

		double a, b, c, p, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introudce el lado 1(a):");
		a = sc.nextDouble();
		System.out.print("\nIntroudce el lado 2(b):");
		b = sc.nextDouble();
		System.out.print("\nIntroudce el lado 3(c):");
		c = sc.nextDouble();

		// CALCULO DE P
		p = (a + b + c) / 2;

		// CALCULO RAIZ CUADRADA

		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("El area del triangulo, segun los lados introducidos es:" + area);
		sc.close();

	}

}
