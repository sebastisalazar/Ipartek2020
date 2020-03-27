package com.ipartek.formacion.compra;

import java.util.ArrayList;
import java.util.Scanner;

public class pruebaComida {

	static ArrayList<Alimentacion> listaCompra = new ArrayList<Alimentacion>();
	static Scanner sc = new Scanner(System.in);
	static boolean continuar = true;
	static int item = 0;
	static String resp;
	static int op;

	public static void main(String[] args) {

		do {

			menu();

			continuar = true;
			do {
				try {
					op = Integer.parseInt(sc.nextLine());
					continuar = false;
				} catch (Exception e) {
					System.out.print("\nError, opcion no reconocida.\n\nIntentalo otra vez: ");
				}
			} while (continuar);

			switch (op) {
			case 1:

				AgregarComida();
				continuar = Continuar();
				break;

			case 2:
				AgregarBebida();
				continuar = Continuar();
				break;

			}// fin switch

		} while (continuar);

		mostrarLista();

		sc.close();
	}// fin main

	static void menu() {
		System.out.println("******************************");
		System.out.println("\n\t MENU");
		System.out.println("1. Comida");
		System.out.println("2. Bebida");
		System.out.print("\n¿Que articulo quieres añadir a la lista?: ");
	}

	static int validarOp(int op) {

		continuar = false;

		do {
			if (op < 1 || op > 2) {
				System.out.println("Error, elige un item de la lista.");
				continuar = false;
			} else {
				continuar = true;
			}
		} while (!continuar);

		return op;

	}

	static void mostrarLista() {

		System.out.println("\n******************************");
		System.out.println("\nArticulos a registrados en la lista ");
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println((i + 1) + "- " + listaCompra.get(i).toString());
		}
	}

	static void AgregarBebida() {

		System.out.println("\n******************************");
		System.out.println("\nOpcion Elegida: AÑADIR BEBIDA");

		Bebida b = new Bebida();
		System.out.print("\nNombre: ");
		b.setNombre(sc.nextLine());
		System.out.print("\nDescripcion: ");
		b.setDescripcion(sc.nextLine());

		continuar = true;
		do {
			try {
				System.out.print("\nPrecio: ");
				b.setPrecio(Double.parseDouble(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		continuar = true;
		do {
			try {
				System.out.print("\nCantidad: ");
				b.setCantidad(Integer.parseInt(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		continuar = true;
		do {
			System.out.print("\nGaseosa (s/n): ");
			resp = sc.nextLine();

			if (resp.equalsIgnoreCase("s")) {
				b.setGaseosa(true);
				continuar = false;
			} else if (resp.equalsIgnoreCase("n")) {
				b.setGaseosa(false);
				continuar = false;
			} else {
				System.out.println("Error, opcion no reconocida.");
			}
		} while (continuar);

		continuar = true;
		do {
			try {
				System.out.print("\nGraduacion: ");
				b.setGraduacion(Double.parseDouble(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		b.setIdItem(item + 1);
		listaCompra.add(b);

	}

	static void AgregarComida() {

		Comida c = new Comida();

		System.out.println("\n******************************");
		System.out.println("\nOpcion Elegida: AÑADIR COMIDA");
		System.out.print("\nNombre: ");
		c.setNombre(sc.nextLine());
		System.out.print("\nDescripcion: ");
		c.setDescripcion(sc.nextLine());

		continuar = true;
		do {
			try {
				System.out.print("\nPrecio: ");
				c.setPrecio(Double.parseDouble(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}

		} while (continuar);

		continuar = true;
		do {
			try {
				System.out.print("\nCantidad: ");
				c.setCantidad(Integer.parseInt(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		continuar = true;
		do {
			try {
				System.out.print("\nPeso: ");
				c.setPeso(Double.parseDouble(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}

		} while (continuar);

		continuar = true;
		do {
			try {
				System.out.print("\nCalorias: ");
				c.setCalorias(Double.parseDouble(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		c.setIdItem(item + 1);

		listaCompra.add(c);
	}

	static Boolean Continuar() {
		boolean correcto;
		boolean seguir = false;

		do {
			correcto = true;
			System.out.println("¿Deseas seguir agregando articulos a la lista de compra? (s/n)");
			resp = sc.nextLine();
			if (resp.equalsIgnoreCase("s")) {
				seguir = true;
			} else if (resp.equalsIgnoreCase("n")) {
				seguir = false;
			} else {
				System.out.println("Error, opcion no reconocida");
				correcto = false;
			}

		} while (!correcto);

		return seguir;

	}

}
