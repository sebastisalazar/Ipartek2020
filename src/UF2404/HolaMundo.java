package UF2404;

/*
 * Esto es un comentario en bloque
 * podemos escribir varias lineas de codigo
 * 
 */

public class HolaMundo {

	// Todo nuestro codigo para ejecutar debe estar dentro del main
	// Las clases empiezan con Mayúsculas
	// Las variables empiezan con Minúsculas
	public static void main(String[] args) {

		// String: es el tipo de la variable persona: nombre de la variable
		// "Ander": es
		// el valor que asignamos a la variable

		String persona = "Ander";
		int edad = 39;
		float altura = 1.73f;// Hay que poner una f al final o (float) por delante
		// float otraAltura = (float) 1.73;
		boolean isGoodDay = false;

		// Usamos el operador + para concatenar String o Cadenas de Texto
		System.out.println("Mi nombre es " + persona);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " metro");

		if (isGoodDay) {
			System.out.println("Hoy tengo un día bueno");
		} else {
			System.out.println("Hoy es un día malo");
		}

	}// fin del metodo main

}// fin de la clase
