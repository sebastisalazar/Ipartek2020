package com.ipartek.formacion.animales;

public class Animal {

	// variables locales
	private String nombre;
	public static final String[] TIPO = { "Mamimefero", "Ave", "Pez" };
	private String tipo;
	private int patas;

	// CONSTRUCTOR
	public Animal() {
		super();
		this.nombre = "";
		this.tipo = "";
		this.patas = 0;
	}


	// GETTERS AND SETTERS

	public String getGenero() {
		return nombre;
	}

	public void setGenero(String genero) {
		this.nombre = genero;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", patas=" + patas + "]";
	}

}
