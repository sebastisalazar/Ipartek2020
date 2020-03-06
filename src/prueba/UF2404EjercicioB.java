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
	static Scanner sc;
	final static char LETRASDNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) {

		int opcion;
		sc = new Scanner(System.in);
		boolean continuar = true;

		do {
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

			}// switch

		} while (continuar);

		sc.close();
	}

	private static void pintarMenu() {
		System.out.println("\n******************************");
		System.out.println("\n\t MENU\n");
		System.out.println("1. Calcular letra DNI");
		System.out.println("2. Convertir de cm a pulgadas");
		System.out.println("3. Salir");
		System.out.println("\n******************************");

	}

	private static void conversionCmPulgadas() {
		double cm;
		System.out.println("\n******************************");
		System.out.println("\n    CONVERSION CM A PULGADAS\n");
		System.out.print("Introduce los cm: ");
		cm = Double.parseDouble(sc.nextLine());
		System.out.println("La conversion de " + cm + "cm a pulgadas es: " + String.format("%.5f", (cm / 2.54)));

	}

	private static void calcularDNI() {
		System.out.println("\n******************************");
		System.out.println("\n\t CALCULO LETRA DNI\n");
		System.out.print("Introduce los numeros de tu DNI: ");
		String dni = sc.nextLine();
		System.out.println("La letra para el dni " + dni + " es: " + LETRASDNI[Integer.parseInt(dni) % 23]);

	}

}
