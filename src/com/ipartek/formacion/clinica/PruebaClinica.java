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
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		continuar = true;
		int op;

		do {

			cargarDoctores();
			cargarMascotas();
			cargarRevisiones();
			menu();

			continuar = true;
			do {

				try {
					System.out.print("\nElige una opcion: ");
					op = validarOp(Integer.parseInt(sc.nextLine()));
					continuar = false;
				} catch (Exception e) {
					System.out.println("\nError, se ha introducido una letra en lugar de un numero.");
				}
			} while (continuar);

		} while (continuar);

		System.out.println("");
	}

	static void menu() {

		System.out.println("\n\tMENU");
		System.out.println("\n1. Registrar nueva mascota");
		System.out.println("2. Buscar mascotas por id");
		System.out.println("3. ver historial de la mascota");

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

		listaRevisiones.add(r1);
		listaRevisiones.add(r2);
		listaRevisiones.add(r3);
		listaRevisiones.add(r4);
	}

	// CARGAR DOCTORES
	static void cargarDoctores() {

		d1 = new Doctor("Pablo", "8:00am - 14:00pm/ 15:00pm - 17:00pm", 001);
		d2 = new Doctor("Gaizka", "14:00pm - 17:00pm/ 18:00pm - 23:00pm", 002);

	}

	// EVALUA LA OPCION ELEGIDA
	static int validarOp(int op) {

		continuar = false;

		do { // bucle a repetir hasta que el usuario introduzca una opcion valida
			if (op < 1 || op > 3) {
				System.out.println("Error, elige un item de la lista.");
				continuar = false;
			} else {
				continuar = true;// si es valida rompe el bucle
			}
		} while (!continuar);

		return op;

	}// fin validarOP
}
