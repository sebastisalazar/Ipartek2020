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

		// bucle para seguir mostrando el menu
		do {
			menu();
			int op = validarOpcion();// Asegura que el usuario eliga una opcion valida

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

			continuar = Seguir();// pregunta al usuario para poder continuar

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

		boolean seguir = false; // boolean para guardar la respuesta del usuario
		continuar = false;// se iniciciliza para que no coja el valor anterior
		do {// bucle para repetir hasta que el usuario introduzca una letra valida
			System.out.print("\n\n¿Deseas continuar? (s/n): ");
			String resp = sc.nextLine();
			if (resp.equalsIgnoreCase("s")) {// si es 's' guarda la opcion en seguir y pone a false la variable
												// continuar para parar el bucle
				seguir = true;
				continuar = false;
			} else if (resp.equalsIgnoreCase("n")) {// si es 'n' guarda la opcion en seguir y pone a false la variable
													// continuar para parar el bucle
				seguir = false;
				continuar = false;
			} else { // si no es ni 's' ni 'n' enseña el mensaje
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
			BufferedReader br; // buffer
			FileReader fr = new FileReader("bin/com/ipartek/formacion/ficheros/personas.txt"); // archivo a leer
			br = new BufferedReader(fr); // se indica el buffer qué archivo va a leer

			String linea = br.readLine();// lee cabecera

			while (br.readLine() != null) { // mientras siga habiendo lineas que leer

				linea = br.readLine(); // guarda la linea donde se encuentra y la guarda en un string
				String[] datos = linea.split(";");// se hace un split de la variable linea y se guarda en un array de
													// Strings
				Persona p = new Persona();// se crea objeto Persona

				if (datos.length != 6) { // si la longitud del array datos no es 6 significa que esa linea le falta
											// algun campo por rellenar, por tanto no se guarda
					personasNoLeidas++;// contamos la lineas que les faltan datos
				} else {
					personasLeidasOK++;// se cuentan las lineas que esten bien y tengan todos los datos

					// se rellena el objeto segun los campos recogidos en el array datos
					p.setNombre(datos[0]);
					p.setEmpresa(datos[1]);
					p.setFechaNacimiento(datos[2]);
					p.setTelefono(datos[3]);
					p.setEmail(datos[4]);
					p.setNumeroPersonal(datos[5]);

					listaPersonas.add(p);// Se añade a la lista una vez el objeto tenga todos los datos rellenados

				}

			}
			br.close();// cierre del buffer

			// INFO para saber cuantas NO se han leido
			System.out.println("\nPersonas leidas: " + personasLeidasOK);
			System.out.println("Personas NO leidas por falta de algun dato: " + personasNoLeidas + "\n");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// LISTAR TODAS LAS PERSONAS DEL ARRAYLIST LISTAPERSONAS

	// IMPRIMIR LISTA
	static void listarPersonas() {

		int i = 1;// variable para sacar el indice por linea
		for (Persona persona : listaPersonas) {
			System.out.println("\n" + i + ".- " + persona.toString());
			i++;

		}
	}

	// LISTAR PERSONA/AS, RECIBE COMO PARAMETRO ARRAY LIST DE PERSONAS
	static void listarPersonas(ArrayList<Persona> p) {

		// si la lista que se pasa por parametro esta vacia enseña mensaje
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
		} else {// si el objeto no esta vacio se imprime
			System.out.print("\n" + p.toString());
		}

	}

	// BUSCAR POR NOMBRE
	static ArrayList<Persona> buscarPorNombre() {

		System.out.print("\nEscribe el nombre a buscar: ");
		String nombre = sc.nextLine();

		// Array list por si existiese personas con el mismo nombre
		ArrayList<Persona> resultado = new ArrayList<Persona>();
		int coincidencias = 0; // para saber si al menos existe una persona con ese nombre

		for (Persona persona : listaPersonas) {
			// si el nombre del objeto persona coincide
			if (persona.getNombre().equalsIgnoreCase(nombre)) {
				resultado.add(persona);// se agrega la objeto persona al array list
				coincidencias += 1;// se suma las coincidencias (num personas con ese nombre)
			}
		}

		// si no hay ninguna persona con ese nombre se da el valor a null
		if (coincidencias == 0) {
			resultado = null;
		}

		return resultado;
	}

	// BUSCAR POR EMAIL
	static Persona buscarPorEmail() {
		System.out.print("\nEscribe el email a buscar: ");
		String email = sc.nextLine();
		Boolean encontrado = false; // para saber si el email se ha encontrado

		Persona p = new Persona();

		for (Persona persona : listaPersonas) {
			// si el mail del objeto persona es el que se esta buscando
			if (persona.getEmail().equalsIgnoreCase(email)) {
				p = persona; // se copia el objeto
				encontrado = true;// se avisa que se ha encontrado
			}
		}

		// si encontrado es false significa que no existe una persona con ese mail, por
		// lo tanto se iniicializa el objeto persona a null
		if (encontrado == false) {
			p = null;
		}

		return p;

	}

	// BUSCAR POR NUMERO DE LINEA
	static Persona buscarPorLinea() {

		Persona p = new Persona();
		continuar = true;// se inicializa para que no coja el valor de la ultima vez que se utilizo∫
		do {// bucle para que el usuario escriba una linea valida
			try {// excepcion para que el usuario no introduzca una letra, numeros negativos o
					// caracteres
				System.out.print("\nEscribe la linea a buscar: ");
				int numlinea = Integer.parseInt(sc.nextLine());

				// Si el usuario indica la linea 0 ó superior a la longitud (el total de
				// personas en la lista) muestra mensaje
				if (numlinea == 0 || numlinea > listaPersonas.size()) {
					System.out.print("Error, linea no valida\n");
				} else {
					// si la linea es valida se copia el objeto que exista en esa linea
					p = listaPersonas.get(numlinea - 1);
					continuar = false;// se inicializa para romper el bucle

				}

			} catch (Exception e) {
				System.out.print("Error, se debe introducir un numero entero positivo\n");
			} // fin try catch
		} while (continuar);

		return p;

	}
}
