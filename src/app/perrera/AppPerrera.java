package app.perrera;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int op;

		do {
			System.out.println("\n************************************\n");
			pintarMenu();
			op = validarOpcionElegida();
			System.out.println("\n************************************\n");
			IniciarOpcion(op);

		} while (op != 8);
		System.out.println("\n************************************\n");
		System.out.println("\n\tFIN\n");
		System.out.println("\n************************************\n");
		sc.close();
	}// fin main

	static void pintarMenu() {
		System.out.println("\n\tMENU\n\n" + "1. Listar Perros\n" + "2. Buscar por nombre\n" + "3. Buscar por raza\n"
				+ "4. Buscar por ID\n" + "5. Borrar Perro\n" + "6. Crear Perro\n" + "7. Modificar datos\n"
				+ "8. Salir\n");
	}// fin pintar menu

	static int validarOpcionElegida() {
		int op = 0;
		boolean continuar = true;
		do {// bucle para validar opcion elegida
			System.out.print("\nElige una opcion: ");

			// Control errores
			try {
				op = Integer.parseInt(sc.nextLine());

				// si la opcion elegida no esta entre 1 y 8 muestra mensaje
				if (op < 1 || op > 8) {
					System.out.println("\nOpcion no valida, intenta otra vez");
					continuar = false;
					pintarMenu();
				} else {
					// si la opcion esta entre 1 y 8 continua
					continuar = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("\nError, se ha introducido una letra en lugar de un numero \n");
				continuar = false;
				pintarMenu();
			}

		} while (!continuar);

		return op;
	}// Fin validar opcion

	static void IniciarOpcion(int op) {
		String nombre;
		int id;
		switch (op) {
		case 1:
			System.out.println("\n   OPCION ELEDIGA: LISTAR PERROS\n");
			ListarPerros(dao.getAll());
			break;
		case 2:
			System.out.println("\n   OPCION ELEDIGA: BUSCAR POR NOMBRE\n");
			System.out.print("\n Nombre a buscar: ");
			nombre = sc.nextLine();
			ListarPerros(dao.buscarPorNombre(nombre));
			break;

		case 3:
			System.out.println("\n   OPCION ELEDIGA: BUSCAR POR ID\n");
			System.out.print("\n ID a buscar: ");
			id = Integer.parseInt(sc.nextLine());
			dao.getById(id).toString();
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
			System.out.println("\n" + p.get(i).toString());
		}
	}// fin listarPerros

}// FIN CLASE
