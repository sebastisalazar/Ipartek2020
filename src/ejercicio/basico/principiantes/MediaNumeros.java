package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * 
 * Ejerciciopara pedir 3 numeros por pantalla y sacar la media
 *
 */

public class MediaNumeros {

	public static void main(String[] args) {

		int num1, num2, num3;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número:");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("Dime el segundo número:");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("Dime el tercer número:");
		num3 = Integer.parseInt(sc.nextLine());

		media = (float) ((num1 + num2 + num3) / 3.0);

		System.out.println("La media es : " + media);

		sc.close();

	}

}
