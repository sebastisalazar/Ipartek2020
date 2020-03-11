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
				System.out.println("\n************************************\n");
				pintarMenu();
			}

		} while (!continuar);

		return op;
	}// Fin validar opcion

	static void IniciarOpcion(int op) {

		try {

			String nombre = "", raza = "";
			int id = 0;
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
				System.out.println("\n   OPCION ELEDIGA: BUSCAR POR RAZA\n");
				System.out.print("\n Raza a buscar: ");
				raza = sc.nextLine();
				ListarPerros(dao.buscarPorRaza(raza));
				break;
			case 4:
				System.out.println("\n   OPCION ELEDIGA: BUSCAR POR ID\n");
				System.out.print("\n ID a buscar: ");

				try {
					id = Integer.parseInt(sc.nextLine());
					ListaPerro(dao.getById(id));
				} catch (Exception e) {
					System.out.println("\nError, un ID sólo contiene numeros");
				}

				break;
			case 5:
				System.out.println("\n   OPCION ELEDIGA: BORRAR PERRO\n");
				ListarPerros(dao.getAll());
				System.out.print("\n id perro a borrar: ");
				id = Integer.parseInt(sc.nextLine());
				boolean resul = dao.delete(id);

				if (resul) {
					System.out.println("\nEl perro con id " + id + "se ha borrado correctamente");
					ListarPerros(dao.getAll());
				} else {
					System.out.println("\nLo sentimos, no se ha encontrado ningun perro con el id " + id);
				}

				break;

			case 6:
				System.out.println("\nOPCION ELEDIGA: CREAR PERRO\n");
				Boolean continuar = false;
				Perro p = new Perro();

				// Comprobacion ID solo numeros
				do {

					try {

						System.out.print("\nID: ");
						id = Integer.parseInt(sc.nextLine());
						continuar = true;
					} catch (Exception e) {
						System.out.println("\nError, el ID solo puede contener numeros");
						continuar = false;
					}

				} while (!continuar);

				// Comprobacion NOMBRE NO vacio

				continuar = false;
				do {

					System.out.print("\nNombre: ");
					nombre = sc.nextLine();
					// si el nombre es vacio lanza excepcion
					try {

						if (nombre.equalsIgnoreCase("")) {
							throw new Exception("\nError, el nombre no se puede dejar en blanco");

						} else {

							System.out.print("\nRaza: ");
							raza = sc.nextLine();

							if (raza.equalsIgnoreCase("")) {
								p = new Perro(nombre, id);
							} else {
								p = new Perro(nombre, id, raza);
							}
							continuar = true;
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				} while (!continuar);

				System.out.println("\nPerro registrado correctamente");
				ListaPerro(dao.crear(p));
				break;
			case 7:
				int i;
				System.out.println("\nOPCION ELEDIGA: MODIFICAR DATOS\n");
				ListarPerros(dao.getAll());
				continuar = false;
				do {
					try {
						System.out.print("\nSelecciona algun perro de la lista (por numero de lista): ");
						i = Integer.parseInt(sc.nextLine());
						Perro perroAmodificar = dao.getAll().get(i);
						continuar = true;

					} catch (Exception e) {
						System.out.println("\nError, no se ha introducido un numero");
					}
				} while (!continuar);

				break;

			}// fin switch

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}// fin iniciar opcion

	static void ListarPerros(ArrayList<Perro> p) {
		for (int i = 0; i < p.size(); i++) {
			System.out.println("\n" + (i + 1) + " -- " + p.get(i).toString());
		}
	}// fin listarPerroS

	static void ListaPerro(Perro p) {

		if (p != null) {
			System.out.println("\n" + p.toString());
		} else {
			System.out.println("\n\t ID no encontrado");
		}

	}// fin listaPerro

}// FIN CLASE
