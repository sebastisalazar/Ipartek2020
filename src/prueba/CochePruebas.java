package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class CochePruebas {

	// variables globales
	// Creacion lista
	private static ArrayList<Coche> coches = new ArrayList<Coche>();

	public static void main(String[] args) {

		// Variables locales
		char resp = 's';
		boolean isDatoCorrecto;
		Scanner sc = new Scanner(System.in);

		// bucle menu insercion coches
		do {

			// pedir datos
			Coche coche = new Coche();
			System.out.println("********************************");
			System.out.println("\tREGISTRO COCHE");
			System.out.print("\nMatricula: ");
			coche.setMatricula(sc.nextLine());
			System.out.print("\nMarca: ");
			coche.setMarca(sc.nextLine());
			System.out.print("\nModelo: ");
			coche.setModelo(sc.nextLine());
			System.out.print("\nColor: ");
			coche.setColor(sc.nextLine());

			// Bucle para que se introduzca un numero para la POTENCIA
			do {
				isDatoCorrecto = false;

				// try para mostrar al usuario el fallo
				try {
					System.out.print("\nPotencia: ");
					coche.setPotencia(Float.parseFloat(sc.nextLine()));
					isDatoCorrecto = true;
				} catch (Exception e) {
					System.out.println("Error, se ha introducido una letra en lugar de un numero");
				}
			} while (!isDatoCorrecto);

			// Bucle para que se introduzca un numero para la CILINDRADA
			do {

				// se vuelve a inicilizar false ya que estaria cogiendo el true del anterior do
				// while
				isDatoCorrecto = false;
				// try para mostrar al usuario el fallo
				try {
					System.out.print("\nCilindrada: ");
					coche.setCilindrada(Float.parseFloat(sc.nextLine()));
					isDatoCorrecto = true;
				} catch (Exception e) {
					System.out.println("Error, se ha introducido una letra en lugar de un numero");
				}
			} while (!isDatoCorrecto);

			// añade coche una vez que se tenga todos los datos recogidos
			coches.add(coche);

			// bucle para validar respuesta
			do {
				// se vuelve a inicilizar false ya que estaria cogiendo el true del anterior do
				// while
				isDatoCorrecto = false;

				// Salida del menu
				System.out.print("\n¿Desea registrar otro coche? (s/n): ");

				/**
				 * RESP= La respuesta que de el usuario se pasa a un array de char, de ese array
				 * de chars se lee sólo la posicion [0]. Así si el usuario ingresa un 'ss' solo
				 * se lee 's'.
				 */

				resp = ((sc.nextLine().toCharArray())[0]);

				// Si la respuesta del usuario es distinta de 's' o 'n' se evalua
				if (resp != 's' && resp != 'n') {

					// caputurar excepciones para ver si el usuario introduce un numero en lugar de
					// una letra
					try {

						// si la respuesta es un integer se avisa del error
						if (Integer.class.isInstance(Integer.parseInt(String.valueOf(resp))) == true) {
							System.out.println("Error se ha introducido un numero en lugar de una letra");
						} // Fin if
					} catch (Exception e) {
						System.out.println("Error, opcion no reconocida");
					} // fin try catch

					isDatoCorrecto = false;

					// si la respuesta es una letra se dice que el dato es correcto
				} else {
					isDatoCorrecto = true;
				} // Fin if

			} while (!isDatoCorrecto); // fin bucle

			// Mientras que la variable resp sea distinta a 'n'
		} while (!String.valueOf(resp).toString().toLowerCase().equalsIgnoreCase("n"));

		sc.close();// Cierre escaner cuando el usuario no quiera registrar mas coches

		// cabecera
		System.out.println("********************************");
		System.out.println("\t\nLista de coches registrados\n");

		// Mostrar datos por pantalla (Listar arraylist coches)
		for (Coche coche : coches) {
			System.out.println(coche);
		} // Fin for each
	}// Fin main

}// fin clase
