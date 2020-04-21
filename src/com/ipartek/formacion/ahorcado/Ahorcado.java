package com.ipartek.formacion.ahorcado;

public class Ahorcado {

	public static void main(String[] args) {
		String[] palabras = { "Elefante", "Amor", "casa" };
		int posicionAleatoria = (int) Math.floor(Math.random() * (palabras.length));
		String palabra = palabras[posicionAleatoria];
		char[] letras = palabra.toCharArray();
		char[] letrasConGuiones = new char[letras.length];
		for (int i = 0; i < letras.length; i++) {

		}
	}

}
