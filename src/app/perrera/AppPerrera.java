package app.perrera;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();

	public static void main(String[] args) {

		pintarMenu();
		IniciarOpcion(validarOpcionElegida());

	}// fin main

	static void pintarMenu() {
		System.out.println("\n\tMENU\n\n" + "1. Listar Perros\n" + "2. Buscar por nombre\n" + "3. Buscar por raza\n"
				+ "4. Buscar por ID\n" + "5. Borrar Perro\n" + "6. Crear Perro\n" + "7. Modificar datos\n"
				+ "8. Salir\n");
	}// fin pintar menu

	static int validarOpcionElegida() {
		int op;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("\nElige una opcion: ");
			op = Integer.parseInt(sc.nextLine());

			if (op < 1 || op > 8 && op != 8) {
				System.out.println("Opcion no valida, intenta otra vez");
			}
		} while (op < 1 || op > 8 && op != 8);

		sc.close();
		return op;
	}// Fin validar opcion

	static void IniciarOpcion(int op) {
		switch (op) {
		case 1:
			System.out.println("\n************************************\n");
			System.out.println("\n   OPCION ELEDIGA: LISTAR PERROS\n");
			ListarPerros(dao.getAll());
			System.out.println("\n************************************\n");
			break;

		// TODO buscar por ID
		// TODO pedir al usuario por pantalla el ID
		// TODO llamar al DAO al metodo getByID y recoger resultado
		// TODO si resultado != null mostrar perro por pantalla
		// TODO si resultado= null mostrar que el perro no se ha encontrado

		default:
			break;
		}// fin switch
	}// fin iniciar opcion

	static void ListarPerros(ArrayList<Perro> p) {
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).toString());
		}
	}// fin listarPerros
}// FIN CLASE
