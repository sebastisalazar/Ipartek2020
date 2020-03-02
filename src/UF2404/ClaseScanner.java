package UF2404;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {

		System.out.println("Dime un número:");

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		// llama a la clase isPAR
		System.out.println("El número " + numero + " es " + isPAR(numero));
		sc.close();

	}// fin del main

	public static String isPAR(int num) {

		String resul = "IMPAR";

		if (num % 2 == 0) {
			resul = "PAR";
		} // fin if

		return resul;
	}// fin metodo is PAR

}// FIN CLASE
