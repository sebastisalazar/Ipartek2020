package UF2404;

import java.util.Scanner;

public class PreguntarNoombreCompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Preguntar nombre
		// Preguntar 1er apellido
		// Preguntar 2do apellido
		// Mostrar nombre completo

		String nombre, ape1, ape2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		ape1 = sc.nextLine();
		System.out.println("Introduce tu segundo apellido: ");
		ape2 = sc.nextLine();

		sc.close();

		System.out.println("Tu nombre completo es: " + nombre + " " + ape1 + " " + ape2);

	}

}
