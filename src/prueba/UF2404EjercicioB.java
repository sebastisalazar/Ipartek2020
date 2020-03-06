package prueba;

import java.util.Scanner;

public class UF2404EjercicioB {

	/**
	 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones •
	 * <ol>
	 * <li>Calcular la letra del dni</li>
	 * <li>Calcular medida de cm a pulgadas</li>
	 * <li>Salir</li>
	 * </ol>
	 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
	 * usuario escoge cada una de las funciones, que permita introducir los datos
	 * correspondientes por teclado para poder dar el resultado
	 * 
	 * @param args
	 */

	// variables globales
	static Scanner sc;
	final static char LETRASDNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) {

		// Variables
		int opcion;
		sc = new Scanner(System.in);
		boolean continuar = true;

		// Bucle
		do {

			try {
				pintarMenu();
				System.out.print("Elige una opcion: ");
				opcion = Integer.parseInt(sc.nextLine());
				switch (opcion) {
				case 1:
					calcularDNI();
					break;

				case 2:
					conversionCmPulgadas();
					break;

				case 3:
					System.out.println("\nHasta pronto");
					continuar = false;
					break;

				default:
					System.out.println("\nPor favor selecciona una opcion valida");
					break;

				}// Fin switch

			} catch (NumberFormatException e) {
				System.out.println("\nOpcion elegida no es un numero");
			}

		} while (continuar);

		sc.close(); // Cierre scanner
	}// Fin main

	// Creacion del menu
	private static void pintarMenu() {
		System.out.println("\n******************************");
		System.out.println("\n\t MENU\n");
		System.out.println("1. Calcular letra DNI");
		System.out.println("2. Convertir de cm a pulgadas");
		System.out.println("3. Salir");
		System.out.println("\n******************************");

	}// fin pintar menu

	// Calculo letra DNI
	private static void calcularDNI() {
		System.out.println("\n******************************");
		System.out.println("\n\t CALCULO LETRA DNI\n");
		String dni = "";
		boolean continuar = true;
		do {

			System.out.print("Introduce los numeros de tu DNI: ");
			dni = sc.nextLine();

			if (dni.length() > 8 || dni.length() < 8) {

				System.out.println("\nError, debe contener al menos 8 digitos numéricos\n");
				continuar = false;
			} else {
				try {
					System.out.println("La letra para el dni " + dni + " es: " + LETRASDNI[Integer.parseInt(dni) % 23]);
				} catch (NumberFormatException e) {
					System.out
							.println("\nEl dato introducido es incorrecto, NO debe contener ni caracteres ni letra \n");
					continuar = false;
				} // Fin Try catch
			}

		} while (!continuar);

	}// Fin calculo dni

	// Conversion a pulgadas
	private static void conversionCmPulgadas() {
		double cm;

		try {
			System.out.println("\n******************************");
			System.out.println("\n    CONVERSION CM A PULGADAS\n");
			System.out.print("Introduce los cm: ");
			cm = Double.parseDouble(sc.nextLine());
			System.out.println("La conversion de " + cm + "cm a pulgadas es: " + String.format("%.5f", (cm / 2.54)));

		} catch (NumberFormatException e) {
			System.out.println("\nEl dato introducido es incorrecto");
		} // Fin Try catch
	}// Fin conversion cm a pulgadas

}// Fin clase
