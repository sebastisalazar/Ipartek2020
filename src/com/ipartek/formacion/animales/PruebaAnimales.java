package com.ipartek.formacion.animales;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAnimales {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

		for (int i = 0; i < 10; i++) {

			int op = menu();
			char resp;
			boolean continuar = true;

			switch (op) {
			case 1:
				System.out.println("\nCrear Perro");
				Perro p = new Perro();

				do {

					System.out.print("\n¿Desea detallar las caracteristicas del gato? (s/n): ");
					resp = sc.nextLine().toCharArray()[0];

					if (resp == 's') {
						p = detallarPerro(p);
						listaAnimales.add(p);
						continuar = true;

					} else if (resp == 'n') {

						listaAnimales.add(p);
						continuar = true;
					} else {
						System.out.println("Opcion no reconocida");
						continuar = false;
					}
				} while (!continuar);

				System.out.println("\nPerro agregado correctamente a la lista");
				break;
			case 2:
				System.out.println("\nCrear Gato");
				Gato g = new Gato();

				do {
					System.out.print("\n¿Desea detallar las caracteristicas del gato? (s/n): ");
					resp = sc.nextLine().toCharArray()[0];

					if (resp == 's') {
						g = detallarGato(g);
						listaAnimales.add(g);
						continuar = true;
					} else if (resp == 'n') {

						listaAnimales.add(g);
						continuar = true;
					} else {
						System.out.println("Opcion no reconocida");
						continuar = false;
					}
				} while (!continuar);

				System.out.println("Gato agregado correctamente a la lista");
				break;
			case 3:
				System.out.println("\nCrear Canario");
				Canario c = detallarCanario(new Canario());
				listaAnimales.add(c);
				System.out.println("Canario agregado correctamente a la lista");
				break;

			case 4:

				System.out.println("\nCrear Pez");
				Pez pz = detallarPez(new Pez());
				listaAnimales.add(pz);
				System.out.println("Pez agregado correctamente a la lista");
				break;

			}// fin switch

			System.out.println("*******************************");

			System.out.println("\nResumen de animales registrados");

			for (int j = 0; j < listaAnimales.size(); j++) {
				System.out.println((j + 1) + "- " + listaAnimales.get(j).toString());
			}
			System.out.println("\n*******************************");

		} // fin for

	}// fin main

	public static int menu() {

		int op = 0;
		boolean isValido = false;
		do {
			System.out.println("\n\n\tMENU");
			System.out.println("1. Crear Perro");
			System.out.println("2. Crear Gato");
			System.out.println("3. Crear Canario");
			System.out.println("4. Crear Pez");
			System.out.print("\nElige una opcion: ");

			try {
				op = Integer.parseInt(sc.nextLine());
				isValido = validarop(op);
				if (!isValido) {
					System.out.println("Error, opcion no reconocida, intentalo otra vez");
				}
			} catch (Exception e) {
				System.out.println(
						"Error, se ha introducido una letra, blanco o caracter en lugar de unu numero, intentalo otra vez");
			}

		} while (isValido == false);

		return op;

	}

	static boolean validarop(int op) {

		boolean resp = true;

		if (op < 1 || op > 4) {
			resp = false;
		}
		return resp;

	}

	static Perro detallarPerro(Perro p) {

		p.setCola(true);
		p.setPelo(true);
		p.setOrejas(2);
		p.setPatas(4);

		System.out.print("\nEscribe el color del perro: ");
		String color = sc.nextLine();
		p.setColor(color);
		System.out.print("\nIntroduce el genero del perro: ");
		String genero = sc.nextLine();
		p.setGenero(genero);

		System.out.print("\nIntroduce su nombre: ");
		String nombre = sc.nextLine();
		p.setNombre(nombre);

		System.out.print("\nIntroduce la raza: ");
		String raza = sc.nextLine();
		p.setRaza(raza);
		return p;

	}

	static Gato detallarGato(Gato p) {

		p.setCola(true);
		p.setPelo(true);
		p.setOrejas(2);
		p.setPatas(4);

		System.out.print("\nEscribe el color del gato: ");
		String color = sc.nextLine();
		p.setColor(color);
		System.out.print("\nIntroduce el genero del gato: ");
		String genero = sc.nextLine();
		p.setGenero(genero);

		System.out.print("\nIntroduce su nombre: ");
		String nombre = sc.nextLine();
		p.setNombre(nombre);

		System.out.print("\nIntroduce la raza: ");
		String raza = sc.nextLine();
		p.setRaza(raza);
		return p;

	}

	static Canario detallarCanario(Canario c) {

		System.out.print("\nIntroduce el genero: ");
		String genero = sc.nextLine();
		c.setGenero(genero);
		System.out.print("\nIntroduce el nombre: ");
		String nombre = sc.nextLine();
		c.setNombre(nombre);
		System.out.print("\nIntroduce el color: ");
		String color = sc.nextLine();
		c.setColor(color);

		return c;

	}

	static Pez detallarPez(Pez p) {
		System.out.print("\nIntroduce el genero: ");
		String genero = sc.nextLine();
		p.setGenero(genero);
		System.out.print("\nIntroduce el color: ");
		String color = sc.nextLine();
		p.setColor(color);
		System.out.print("\nIntroduce el nombre: ");
		String nombre = sc.nextLine();
		p.setNombre(nombre);

		return p;
	}

}
