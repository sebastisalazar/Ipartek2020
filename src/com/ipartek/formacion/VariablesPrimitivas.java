package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {

		/**
		 * Las variables primitivas siempre empiezan por minusculas y tienen un valor
		 * inicial
		 */

		// booleanos
		boolean tienesCoronaVirus = true; // valor por defecto false

		// enteros
		byte bite = 0; // 1byte ==8bits
		short corto = 0; // 2bytes
		int entero = 0; // 4 bytes
		long largo = 0; // 8 bytes

		// reales o numero con coma
		float numeroReal = 2f; // es necesario poner una f al final o por delante (float)
		double todaviaMasGrande = 6; // No hace falta castear o poner el tipo

		// caracteres
		char letra = 'a'; // se usa comillas simples
		char letraA = 65;

		/**
		 * wrappers: son clases que nos ayudan a trabajar con las variables primitivas,
		 * estas empiezan siempre por mayusculas
		 * 
		 * int => Integer <br>
		 * boolean => Boolean <br>
		 * char => Character <br>
		 * ...<br>
		 * ...<br>
		 * 
		 */

		System.out.println("Un integer ocupa " + Integer.SIZE + " bits");
		System.out.println("Valor minimo " + Integer.MIN_VALUE + " valor maximo " + Integer.MAX_VALUE);

		String numeroEnFormatoTexto = "23";
		int numero2 = 2;

		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2 + " + " + numeroEnFormatoTexto + " = " + total);
	}

}
