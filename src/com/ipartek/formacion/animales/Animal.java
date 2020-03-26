package com.ipartek.formacion.animales;

public class Animal {

	// variables locales
	private String genero;
	public static final String[] TIPO = { "Mamimefero", "Ave", "Pez" };
	private String tipo;

	// CONSTRUCTORES
	public Animal() {
		super();
		this.genero = "";
		this.tipo = "";
	}

	public Animal(String tipo) {
		super();
		this.genero = "";
		this.tipo = tipo;
	}

	// GETTERS AND SETTERS

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// TO STRING

	@Override
	public String toString() {
		return "genero=" + genero + ", tipo=" + tipo;
	}

}
