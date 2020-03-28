package com.ipartek.formacion.clinica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class PruebaClinica {

	static ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
	static ArrayList<Revision> listaRevisiones = new ArrayList<Revision>();
	static Doctor d1;
	static Doctor d2;
	static boolean continuar;
	static String resp;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		continuar = true;
		int op;
		boolean salir;

		do {

			cargarDoctores();
			cargarMascotas();
			cargarRevisiones();
			menu();

			continuar = true;
			op = validarOp();

			switch (op) {
			case 1:
				System.out.println("\n*******************************");
				System.out.println("\nOpcion elegida: REGISTRAR NUEVA MASCOTA");
				registrarMascota();
				System.out.println("\nMascota registrada.");
				break;
			case 2:
				System.out.println("\n*******************************");
				System.out.println("\nOpcion elegida: BUSCAR MASCOTA POR ID");
				Mascota m = buscarPorID();
				mostrarMascota(m);
				break;

			case 3:
				System.out.println("\n*******************************");
				System.out.println("\nOpcion elegida: VER HISTORIAL DE LA MASCOTA");
				historialMascotas();
				break;

			}

			continuar = true;
			salir = true;
			do {
				System.out.print("\n\n¿Desea continuar? (s/n): ");
				resp = sc.nextLine();

				if (resp.equalsIgnoreCase("n")) {
					salir = false;
					continuar = false;
				} else if (resp.equalsIgnoreCase("s")) {
					continuar = false;
				} else {
					System.out.print("\nError, opcion no reconocida");
				}

			} while (continuar);

		} while (salir);

	}

	// MENU
	static void menu() {
		System.out.println("\n*******************************");
		System.out.println("\n\tMENU");
		System.out.println("\n1. Registrar nueva mascota");
		System.out.println("2. Buscar mascotas por id");
		System.out.println("3. Ver historial de la mascota");

	}

	// CARGAR MASCOTAS
	static void cargarMascotas() {

		Mascota m1 = new Mascota("Dinky", "Perro", "Cruce", 5, 1234);
		Mascota m2 = new Mascota("Duni", "Gato", "Persa", 8, 4321);
		Mascota m3 = new Mascota("Piolin", "Ave", "Canario", 2, 3421);
		Mascota m4 = new Mascota("Nemo", "Pez", "Payaso", 1, 2431);

		listaMascotas.add(m1);
		listaMascotas.add(m2);
		listaMascotas.add(m3);
		listaMascotas.add(m4);
	}

	// CARGAR REVISIONES
	static void cargarRevisiones() {

		String fecha = String.valueOf(Calendar.DATE);
		fecha += "/" + String.valueOf(Calendar.MONTH);
		fecha += "/" + String.valueOf(Calendar.YEAR);

		Revision r1 = new Revision(fecha, 001, 1234, "Efermo", "Recuperado", "BLABLABLA");
		Revision r2 = new Revision(fecha, 002, 4321, "Efermo", "Recuperado", "BLABLABLA");
		Revision r3 = new Revision(fecha, 001, 3421, "Efermo", "Recuperado", "BLABLABLA");
		Revision r4 = new Revision(fecha, 002, 2431, "Efermo", "Recuperado", "BLABLABLA");
		Revision r5 = new Revision(fecha, 001, 1234, "Efermo", "Recuperado", "BLABLABLA");

		listaRevisiones.add(r1);
		listaRevisiones.add(r2);
		listaRevisiones.add(r3);
		listaRevisiones.add(r4);
		listaRevisiones.add(r5);
	}

	// CARGAR DOCTORES
	static void cargarDoctores() {

		d1 = new Doctor("Pablo", "8:00am - 14:00pm/ 15:00pm - 17:00pm", 001);
		d2 = new Doctor("Gaizka", "14:00pm - 17:00pm/ 18:00pm - 23:00pm", 002);

	}

	// EVALUA LA OPCION ELEGIDA
	static int validarOp() {

		int op = 0;
		continuar = true;
		do { // bucle a repetir hasta que el usuario introduzca una opcion valida

			System.out.print("\nElige una opcion: ");
			try {
				op = Integer.parseInt(sc.nextLine());
				if (op >= 1 && op <= 3) {
					continuar = false;// si es valida rompe el bucle
				} else {
					System.out.println("Error, opcion no reconocida");
				}
			} catch (Exception e) {
				System.out.println("Error, se ha introducido una letra en lugar de un numero");
			}

		} while (continuar);

		return op;

	}// fin validarOP

	// REGISTRAR MASCOTA
	static void registrarMascota() {

		Mascota nueva = new Mascota();
		continuar = true;
		do {
			try {
				System.out.print("\nEdad: ");
				nueva.setEdad(Integer.parseInt(sc.nextLine()));
				continuar = false;
			} catch (Exception e) {
				System.out.println("Error, se debe introducir un numero entero.");
			}
		} while (continuar);

		System.out.print("\nEspecie: ");
		nueva.setEspecie(sc.nextLine());

		System.out.print("\nNombre: ");
		nueva.setNombre(sc.nextLine());

		System.out.print("\nRaza: ");
		nueva.setRaza(sc.nextLine());

		listaMascotas.add(nueva);

	}

	// BUSCAR MASCOTA POR ID
	static Mascota buscarPorID() {

		int id = 0;
		Mascota encontrada = new Mascota();

		continuar = true;// inicializar variable para que no coja el ultimo valor de cuando se uso
		do {// bucle para repertir hasta que el usuario introduzca numeros enteros
			try {// control de excepciones
				System.out.print("\nEscribe el id a buscar: ");
				id = Integer.parseInt(sc.nextLine());
				continuar = false; // si el parseo anterior funciona, se cambia el valor a false para no repetir
			} catch (Exception e) {
				System.out.println("Error, se ha introducido una letra en lugar de un numero.");
			}
		} while (continuar);

		// for para buscar el id indicado por el usuario
		for (int i = 0; i < listaMascotas.size(); i++) {

			if (listaMascotas.get(i).getId() == id) {
				encontrada = listaMascotas.get(i);
				i = listaMascotas.size() - 1;
			} else {
				encontrada = null;// si no encuentra devuelve el objecto con valor null;
			} // fin if
		} // fin for

		return encontrada;

	}

	// MOSTRAR MASCOTA
	static void mostrarMascota(Mascota m) {

		if (m == null) {
			System.out.println("\nMascota no encontrada.");
		} else {
			System.out.println("\nMascota encontrada: " + m.toString());
		}
	}

	// MOSTRAR HISTORIAL MASCOTAS
	static void historialMascotas() {

		ArrayList<Revision> historial = new ArrayList<Revision>();
		Mascota m = buscarPorID();

		mostrarMascota(m);
		if (m != null) {
			for (int i = 0; i < listaRevisiones.size(); i++) {
				if (listaRevisiones.get(i).getIdMascota() == m.getId()) {
					historial.add(listaRevisiones.get(i));
				}
			}

		}

		if (historial == null) {
			System.out.print("\nNo se han encontrado Revisiones para la mascota con id: " + m.getId());
		} else {
			for (Revision revision : historial) {
				System.out.print("\n" + revision.toString());
			}
		}

	}
}
