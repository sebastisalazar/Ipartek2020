package com.ipartek.formacion.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class PaisesArrayList {

	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int op;

		do {
			menu();
			System.out.print("\nElige una opcion: ");
			op = Integer.parseInt(sc.nextLine());

			// CONDICION PARA CONTROLAR LA OPCION ELEGIDA
			// SI LA OPCION ES MENOR QUE 1 Y DISTINTA A 5 ï¿½ SI LA OPCION ES MAYOR QUE 5
			// SACA
			// MENSAJE DE ERROR
			if (op < 1 && op != 5 || op > 5) {
				System.out.println("\nOpciï¿½n no reconocida, intï¿½ntalo otra vez\n\n**************************\n");
			} else { // SI LA OPCION ELEGIDA ES CORRECTA
				switch (op) {
				case 1:
					System.out.println("\n****************************************************\n"
							+ "\n OPCION ELEGIDA: LISTAR PAISES\n");
					listarPaises();
					op = 0;
					break;
				case 2:
					System.out.println("\n****************************************************\n"
							+ "\n OPCION ELEGIDA: CREAR PAIS\n");
					crearPais();
					op = 0;
					break;
				case 3:
					System.out.println("\n****************************************************\n"
							+ "\n OPCION ELEGIDA: ELIMINAR PAIS\n");
					eliminarPais();
					op = 0;
					break;
				case 4:

					System.out.println("\n****************************************************\n"
							+ "\n OPCION ELEGIDA: BUSCAR PAIS\n");
					buscarPais();
					op = 0;
					break;
				case 5:
					op = 5;
					break;
				}// FIN SWITCH
			} // FIN IF ELSE

		} while (op < 1 && op != 5 || op > 5);

	}// FIN MAIN

	// PINTAR MENU
	static void menu() {
		System.out.println(
				"" + "1- Listar paises\n" + "2- Crear Pais\n" + "3- Eliminar Pais\n" + "4- Buscar Pais\n" + "5- Salir"

		);
	}// FIN MENU

	// PINTAR LISTADO DE PAISES
	static int listarPaises() {

		if (listaPaises.size() == 0) {
			System.out.println("\nTodavia no existen paises registrados en la lista\n"
					+ "\n****************************************************\n\n");
			return 0;// SI NO HAY PAISES EN LA LISTA DEVUELVE 0
		} else {
			for (int i = 0; i < listaPaises.size(); i++) {
				System.out.println((i + 1) + " - " + (listaPaises.get(i)).toString());
			} // FIN FOR
			System.out.println("\n\n****************************************************\n\n");
			return 1;

		} // FIN IF

	}// FIN LISTARPAISES

	static void crearPais() {

		Pais p = new Pais();

		System.out.print("\nIntroduce el nombre del pais: ");
		p.setNombre(sc.nextLine());
		System.out.print("\nExisten casos de corona virus en el pais? (s/n): ");

		if ("s".equalsIgnoreCase(sc.nextLine())) {
			System.out.print("\nIndica el numero de casos: ");
			p.setInfectado(true);
			p.setNumeroInfectados(Integer.parseInt(sc.nextLine()));
		} // FIN IF

		System.out.println("\n\n****************************************************\n\n");

		listaPaises.add(p);
	}// FIN CREAR PAIS

	static int eliminarPais() {

		// PRIMERO LISTAMOS LOS PAISES PARA QUE EL USUARIO PUEDA ELEGIR CUAL QUIERE
		// ELIMINAR
		int indice;

		if (listaPaises.size() == 0) {
			System.out.println("\nTodavia no existen paises registrados en la lista\n"
					+ "\n****************************************************\n\n");
			return 0;// SI NO HAY PAISES EN LA LISTA DEVUELVE 0
		} else {

			System.out.println("\t LISTADO PAISES");
			listarPaises();
			System.out.print("¿Que pais deseas borrar? (Indica el numero en la lista): ");
			indice = (Integer.parseInt(sc.nextLine()));
			System.out.println(
					"\n" + listaPaises.get(indice - 1).getNombre().toUpperCase() + " ha sido eliminado correctamente");
			listaPaises.remove(indice - 1);

			// System.out.println("Se ha eliminado correctamente");

			System.out.println("\n\n****************************************************\n\n");
			return 1;
		}

	}

	static void buscarPais() {

		System.out.print("Escribe el pais a buscar: ");
		String buscarp = sc.nextLine();
		int encontradoPosicion = 0;
		boolean encontradoB = false;
		for (int i = 0; i <= listaPaises.size() - 1; i++) {

			if (listaPaises.get(i).getNombre().equalsIgnoreCase(buscarp)) {

				encontradoPosicion = i + 1;
				encontradoB = true;

			}

		}

		if (encontradoB) {
			System.out.println("\n" + buscarp + " si se encuentra en el listado en la posicion" + encontradoPosicion);
		} else {
			System.out.println("\n" + buscarp + " no esta en el listado de paises");

		}
		System.out.println("\n\n****************************************************\n\n");
	}

}// FIN CLASE
