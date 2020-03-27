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

		// bucle para repetir el menu
		do {

			menu();// imprime el menu

			continuar = true; // se inicializa para que no coja el valor anterior
			do {
				try { // captura que el usuario no introduzca una letra u opcion distinta
					op = Integer.parseInt(sc.nextLine());
					continuar = false;// si el usuario introduce una opcion valida, la variable rompe el bucle
				} catch (Exception e) {
					System.out.print("\nError, opcion no reconocida.\n\nIntentalo otra vez: ");
				}
			} while (continuar);

			// llamadas a funciones segun la opcion elegida
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

		mostrarLista(); // si el usuario ya no quiere agregar mas articulos a la lista se muestra el
						// total de registros

		sc.close();
	}// fin main

	// IMPRIME MENU
	static void menu() {
		System.out.println("******************************");
		System.out.println("\n\t MENU");
		System.out.println("1. Comida");
		System.out.println("2. Bebida");
		System.out.print("\n¿Que articulo quieres añadir a la lista?: ");
	}// fin imprime menu

	// EVALUA LA OPCION ELEGIDA
	static int validarOp(int op) {

		continuar = false;

		do { // bucle a repetir hasta que el usuario introduzca una opcion valida
			if (op < 1 || op > 2) {
				System.out.println("Error, elige un item de la lista.");
				continuar = false;
			} else {
				continuar = true;// si es valida rompre el bucle
			}
		} while (!continuar);

		return op;

	}// fin validarOP

	// IMPRIME LA LISTA CON LOS ARTICULOS
	static void mostrarLista() {

		System.out.println("\n******************************");
		System.out.println("\nArticulos a registrados en la lista ");

		// inicio for
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println((i + 1) + "- " + listaCompra.get(i).toString());
		} // fin for
	}// fin imprimir lista

	// AGREGAR BEBIDA
	static void AgregarBebida() {

		System.out.println("\n******************************");
		System.out.println("\nOpcion Elegida: AÑADIR BEBIDA");

		Bebida b = new Bebida();
		System.out.print("\nNombre: ");
		b.setNombre(sc.nextLine());
		System.out.print("\nDescripcion: ");
		b.setDescripcion(sc.nextLine());

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior

		do {// Bucle a repetir hasta que el usuario introduzca un valor double
			try {// controlar excepcion
				System.out.print("\nPrecio: ");
				b.setPrecio(Double.parseDouble(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			} // fin try catch
		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior

		do {// Bucle a repetir hasta que el usuario introduzca un valor double
			try {// controlar excepcion
				System.out.print("\nCantidad: ");
				b.setCantidad(Integer.parseInt(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor 's' o 'n'
			System.out.print("\nGaseosa (s/n): ");
			resp = sc.nextLine();

			// Se evalua la respuesta
			if (resp.equalsIgnoreCase("s")) {
				b.setGaseosa(true);
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} else if (resp.equalsIgnoreCase("n")) {
				b.setGaseosa(false);
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} else {
				System.out.println("Error, opcion no reconocida."); // si no es ni 's' ni 'n' se muestra mensaje
			}
		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor double
			try {// controlar excepcion
				System.out.print("\nGraduacion: ");
				b.setGraduacion(Double.parseDouble(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			}
		} while (continuar);

		b.setIdItem(item + 1); // da un valor al id del producto
		listaCompra.add(b);// añade el articulo a la lista de la compra

	}

	// AGREGAR COMIDA
	static void AgregarComida() {

		Comida c = new Comida();

		System.out.println("\n******************************");
		System.out.println("\nOpcion Elegida: AÑADIR COMIDA");
		System.out.print("\nNombre: ");
		c.setNombre(sc.nextLine());
		System.out.print("\nDescripcion: ");
		c.setDescripcion(sc.nextLine());

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor double
			try {// control excepcion
				System.out.print("\nPrecio: ");
				c.setPrecio(Double.parseDouble(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			} // fin trycatch

		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor entero
			try {// control excepcion
				System.out.print("\nCantidad: ");
				c.setCantidad(Integer.parseInt(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			} // fin try catch
		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor entero
			try {// control excepcion
				System.out.print("\nPeso: ");
				c.setPeso(Double.parseDouble(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			} // fin try catch

		} while (continuar);

		continuar = true;// se vuelve a inicializar para que no coja el valor anterior
		do {// Bucle a repetir hasta que el usuario introduzca un valor double
			try {// control excepcion
				System.out.print("\nCalorias: ");
				c.setCalorias(Double.parseDouble(sc.nextLine()));
				continuar = false;// si es dato es correcto, se pone a false para romper el bucle
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un valor numerico o decimal");
			} // fin try catch
		} while (continuar);

		c.setIdItem(item + 1);// se le da un valor al id del articulo

		listaCompra.add(c);// se añade el articulo a la lista
	}

	// PREGUNTA CONTINUAR
	static Boolean Continuar() {
		boolean correcto;
		boolean seguir = false;

		do { // bucle para repetir hasta que el usuario eliga o 's' o 'n'

			correcto = true; // se inicializa para que no coja el valor anterior
			System.out.println("¿Deseas seguir agregando articulos a la lista de compra? (s/n)");
			resp = sc.nextLine();

			// Se evalua la respuesta
			if (resp.equalsIgnoreCase("s")) {
				seguir = true;
			} else if (resp.equalsIgnoreCase("n")) {
				seguir = false;
			} else {
				System.out.println("Error, opcion no reconocida");
				correcto = false; // si el valor no es ni 's' ni 'n' se pone a falso para que vuelva a repetir
			}

		} while (!correcto);

		return seguir;

	}

}// fin clase
