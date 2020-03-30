package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFicheros {

	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	static int personasLeidasOK = 0;
	static int personasNoLeidas = 0;
	static boolean continuar;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		cargarLista();
		continuar = true;
		do {
			menu();
			int op = validarOpcion();

			switch (op) {
			case 1:
				listarPersonas();
				break;
			case 2:
				listarPersona(buscarPorLinea());
				break;
			case 3:

				listarPersonas(buscarPorNombre());
				break;

			case 4:
				listarPersona(buscarPorEmail());
				break;
			}// fin switch

			continuar = Seguir();

		} while (continuar);

		System.out.println("\n\n*************** FIN ********************");

	}

	// MENU
	static void menu() {

		System.out.println("\n\n**************************************");
		System.out.println("\n\tMENU\n");
		System.out.println("1) Listar personas");
		System.out.println("2) Buscar personas por numero de linea");
		System.out.println("3) Buscar personas por nombre");
		System.out.println("4) Buscar personas por email");
	}

	// PREGUNTA AL USUARIO
	static boolean Seguir() {

		boolean seguir = false;
		continuar = false;
		do {
			System.out.print("\n\n¿Deseas continuar? (s/n): ");
			String resp = sc.nextLine();
			if (resp.equalsIgnoreCase("s")) {
				seguir = true;
				continuar = false;
			} else if (resp.equalsIgnoreCase("n")) {
				seguir = false;
				continuar = false;
			} else {
				System.out.println("Error, opcion no reconocida");
				continuar = true;
			}
		} while (continuar);

		return seguir;

	}

	// VALIDAR MENU
	static int validarOpcion() {

		int op = 0;
		continuar = true;
		do {
			try {
				System.out.print("\nElige una opcion: ");
				op = Integer.parseInt(sc.nextLine());

				if (op < 1 || op > 4) {
					System.out.print("\nError, opción no reconocida.");
				} else {
					continuar = false;
				}

			} catch (Exception e) {
				System.out.print("\nError, se debe introducir un numero entero ");
			}
		} while (continuar);

		return op;

	}

	// CARGAR DATOS LISTA
	static void cargarLista() {

		try {
			BufferedReader br;
			FileReader fr = new FileReader("bin/com/ipartek/formacion/ficheros/personas.txt");
			br = new BufferedReader(fr);
			String linea = br.readLine();// lee cabecera

			while (br.readLine() != null) {

				linea = br.readLine();
				String[] datos = linea.split(";");
				Persona p = new Persona();

				if (datos.length != 6) {
					personasNoLeidas++;
				} else {
					personasLeidasOK++;
					p.setNombre(datos[0]);
					p.setEmpresa(datos[1]);
					p.setFechaNacimiento(datos[2]);
					p.setTelefono(datos[3]);
					p.setEmail(datos[4]);
					p.setNumeroPersonal(datos[5]);

					listaPersonas.add(p);

				}

			}
			br.close();

			System.out.println("\nPersonas leidas: " + personasLeidasOK);
			System.out.println("Personas NO leidas (les falta algun dato): " + personasNoLeidas + "\n");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// LISTAR TODAS LAS PERSONAS DEL ARRAYLIST LISTAPERSONAS

	// IMPRIMIR LISTA
	static void listarPersonas() {

		int i = 1;
		for (Persona persona : listaPersonas) {
			System.out.println("\n" + i + ".- " + persona.toString());
			i++;

		}
	}

	// LISTAR PERSONA/AS, RECIBE COMO PARAMETRO ARRAY LIST DE PERSONAS
	static void listarPersonas(ArrayList<Persona> p) {

		// si la lista que se pasa por parametro esta vacia
		if (p == null) {
			System.out.print("\n\nNo se han encontrado coincidencias");
		} else { // si no esta vacia se imprime los datos
			int i = 1;
			for (Persona persona : p) {
				System.out.print("\n" + i + ".- " + persona.toString());
				i++;

			}
		}

	}

	// LISTAR DATOS PERSONA, RECIBE COMO PARAMETRO EL OBJETO PERSONA
	static void listarPersona(Persona p) {

		// si el objeto que se pasa por parametro esta vacio
		if (p == null) {
			System.out.print("\n\nNo se han encontrado coincidencias");
		} else {
			System.out.print("\n" + p.toString());
		}

	}

	// BUSCAR POR NOMBRE

	// BUSCAR POR NOMBRE
	static ArrayList<Persona> buscarPorNombre() {

		System.out.print("\nEscribe el nombre a buscar: ");
		String nombre = sc.nextLine();
		// Array list por si existiese personas con el mismo nombre
		ArrayList<Persona> resultado = new ArrayList<Persona>();
		int coincidencias = 0; // para saber si al menos existe una persona con ese nombre

		for (Persona persona : listaPersonas) {
			if (persona.getNombre().equalsIgnoreCase(nombre)) {
				resultado.add(persona);
				coincidencias += 1;
			}
		}

		// si no hay ninguna coincidencia con el nombre se da el valor a null
		if (coincidencias == 0) {
			resultado = null;
		}

		return resultado;
	}

	// BUSCAR POR EMAIL
	static Persona buscarPorEmail() {
		System.out.print("\nEscribe el email a buscar: ");
		String email = sc.nextLine();
		Boolean encontrado = false;

		Persona p = new Persona();

		for (Persona persona : listaPersonas) {
			if (persona.getEmail().equalsIgnoreCase(email)) {
				p = persona;
				encontrado = true;
			}
		}
		if (encontrado == false) {
			p = null;
		}

		return p;

	}

	// BUSCAR POR NUMERO DE LINEA
	static Persona buscarPorLinea() {

		Persona p = new Persona();
		continuar = true;
		do {
			try {
				System.out.print("\nEscribe la linea a buscar: ");
				int numlinea = Integer.parseInt(sc.nextLine());
				if (numlinea == 0 || numlinea > listaPersonas.size()) {
					System.out.print("Error, linea no valida\n");
				} else {
					p = listaPersonas.get(numlinea - 1);
					continuar = false;

				}

			} catch (Exception e) {
				System.out.print("Error, se debe introducir un numero entero positivo\n");
			}
		} while (continuar);

		return p;

	}
}
