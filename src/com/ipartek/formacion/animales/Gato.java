package com.ipartek.formacion.animales;

public class Gato extends Mamifero {

	// variable globales privadas

	private String nombre;

	// CONSTRUCTOR
	public Gato() {
		super();
		this.nombre = "";
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "nombre=" + nombre + "," + super.toString();
	}

}
