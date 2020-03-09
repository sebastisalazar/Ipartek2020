package com.ipartek.formacion.excepciones;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * (6)) + 1;
		System.out.println("Numero generado:" + n);
		n = 4;
		int f1;
		File f;
		try {
			switch (n) {
			case 1:
				System.out.println("f1 = 20 / 0\n");
				f1 = 20 / 0;
				break;
			case 2:
				System.out.println("Object ob = null;\r\n" + "ob.toString();\n");
				Object ob = null;
				ob.toString();
				break;
			case 3:
				System.out.println("f1 = Integer.parseInt(\"HOLA\");\n");
				f1 = Integer.parseInt("HOLA");
				break;
			case 4:

				Desktop desktop = Desktop.getDesktop();
				// TODO CAPTURAR LA EXCEPCION CORRECTA
				System.out.println("f = new File(\"\\\\192.168.1.201\\\\Cursos\\hola.txt");

				f = new File("\\192.168.1.201\\Cursos\\hola.txt");

				System.setSecurityManager(new SecurityManager());
				// new
				// URL("\\\\192.168.1.201\\\\Cursos\\\\hola.txt").openConnection().connect();

				desktop.getDesktop().open(f);

				break;
			case 5:
				System.out.println("int[] i = new int[-2];\n");
				int[] i = new int[-2];
				break;
			case 6:
				System.out.println("f = new File(\"c:/ficheros/datos.txt\");\n");
				f = new File("c:/ficheros/datos.txt");
				String cadena1;
				Scanner entrada1 = null;

				entrada1 = new Scanner(f); // se crea un Scanner asociado al fichero
				while (entrada1.hasNext()) { // mientras no se alcance el final del fichero
					cadena1 = entrada1.nextLine(); // se lee una línea del fichero
					System.out.println(cadena1); // se muestra por pantalla
				}

				entrada1.close();

				break;

			default:
				break;
			}

		} catch (ArithmeticException e) {
			System.out.println("Error diviviendo por 0");
		} catch (NullPointerException e) {
			System.out.println("Error, el objecto es null");
		} catch (NumberFormatException e) {
			System.out.println("Error al parsear");
		} catch (SecurityException e) {
			System.out.println("Error, no se tiene acceso al archivo ->\\\192.168.1.201\\Cursos ");
		} catch (NegativeArraySizeException e) {
			System.out.println("Error, el tamaño del array es incorrecto");
		} catch (IOException e) {
			System.out.println("Error, no existe el arhivo");
		} catch (Exception e) {
			System.out.println("Captura exepcion general");
			// TODO: handle exception
		}

	}

}
