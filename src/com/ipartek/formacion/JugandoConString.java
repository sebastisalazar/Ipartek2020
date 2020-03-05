package com.ipartek.formacion;

public class JugandoConString {

	public static void main(String[] args) {

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		int numeros = 0;
		int espacios = 0;

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

			// Cuenta numeros
			if (isNumeric(Character.toString(caracter))) {
				numeros++;
			}

			// Cuenta espacios
			if (Character.toString(caracter).equals(" ")) {
				espacios++;
			}

		} // for

		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);
		System.out.println("Numeros en String: " + numeros);
		System.out.println("Numero de espacios en String: " + espacios);
		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		// mostrar nombre y apellido, la edad y el sueldo anual
		String lineaCVS = "jose;froilan;16;35.000";
		String[] datos = lineaCVS.split(";");

		System.out.println("\n\n**************************************************************\n\n");
		System.out.println("Mostrar nombre y apellido, la edad y el sueldo anual\n");

		for (int j = 0; j < datos.length; j++) {

			switch (j) {
			case 0:
				System.out.print("Nombre: ");
				break;
			case 1:
				System.out.print("Apellido: ");
				break;
			case 2:
				System.out.print("Edad: ");
				break;
			default:
				System.out.print("Sueldo: ");
				break;
			}

			System.out.print(datos[j] + "\n");
		}

		System.out.println("\n\n**************************************************************\n\n");

		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));

		// Buscar primera 'd
		System.out.println("\n\n**************************************************************\n\n");
		System.out.println("Buscar primera 'd'\n");
		System.out.println("La primera 'd' en " + buscarLetra + " esta en la posicion: " + buscarLetra.indexOf("d"));
		System.out.println("\n\n**************************************************************\n\n");
		// Buscar posicion ultima 'a'
		System.out.println("buscar posicion ultima 'a'\n");
		System.out.println("La ultima 'a' en " + buscarLetra + " esta en la posicion: " + buscarLetra.lastIndexOf("a"));
		System.out.println("\n\n**************************************************************\n\n");

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// cambiar numeros por letras y ademas pasar todo a MAYSUCULAS

		System.out.println("\n\n**************************************************************\n\n");
		System.out.println("cambiar numeros por letras y ademas pasar todo a MAYSUCULAS\n");
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		System.out.println("Texto original:" + textoCodificado);
		textoCodificado = textoCodificado.replace("0", "o");
		textoCodificado = textoCodificado.replace("1", "i");
		textoCodificado = textoCodificado.replace("3", "e");
		textoCodificado = textoCodificado.replace("4", "a");
		System.out.println("Texto formateado :" + textoCodificado);
		System.out.println("Texto formateado pasado a MAYUSCULAS :" + textoCodificado.toLowerCase());
		System.out.println("\n\n**************************************************************\n\n");

		// sumar todos los numeros de este String 12345678
		System.out.println("sumar todos los numeros de este String 12345678\n");
		String dni = "12345678";
		int totalsuma = 0;

		for (int i = 0; i < dni.length(); i++) {
			totalsuma += Integer.parseInt(Character.toString(dni.charAt(i)));
		}
		System.out.println("Suma total de los digitos de " + dni + " es: " + totalsuma);
		System.out.println("\n\n**************************************************************\n\n");

		// buscar por interenet como se calcula la letra

		System.out.println("CALCULO DE LETRA PARA EL DNI: " + dni + "\n");
		switch (totalsuma % 23) {
		case 0:
			System.out.println(dni + "T");
			break;
		case 1:
			System.out.println(dni + "R");
			break;
		case 2:
			System.out.println(dni + "W");
			break;
		case 3:
			System.out.println(dni + "A");
			break;
		case 4:
			System.out.println(dni + "G");
			break;
		case 5:
			System.out.println(dni + "M");
			break;
		case 6:
			System.out.println(dni + "Y");
			break;
		case 7:
			System.out.println(dni + "F");
			break;
		case 8:
			System.out.println(dni + "P");
			break;
		case 9:
			System.out.println(dni + "D");
			break;
		case 10:
			System.out.println(dni + "X");
			break;
		case 11:
			System.out.println(dni + "B");
			break;
		case 12:
			System.out.println(dni + "N");
			break;
		case 13:
			System.out.println(dni + "J");
			break;
		case 14:
			System.out.println(dni + "Z");
			break;
		case 15:
			System.out.println(dni + "S");
			break;
		case 16:
			System.out.println(dni + "Q");
			break;
		case 17:
			System.out.println(dni + "V");
			break;
		case 18:
			System.out.println(dni + "H");
			break;
		case 19:
			System.out.println(dni + "L");
			break;
		case 20:
			System.out.println(dni + "C");
			break;
		case 21:
			System.out.println(dni + "K");
			break;
		default:
			System.out.println(dni + "E");
			break;
		}

		System.out.println("\n\n**************************************************************\n\n");

	}// FIN MAIN

	public static boolean isNumeric(String cadena) {

		boolean resultado;

		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}// FIN CLASE ISNuMERIC

}// FIN CLASE
