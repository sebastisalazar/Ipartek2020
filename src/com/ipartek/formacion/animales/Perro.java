package com.ipartek.formacion.animales;

public class Perro extends Mamifero {

	// variables globales
	private String nombre;

	// CONSTRUCTOR
	public Perro() {
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
		return "nombre=" + nombre + ", " + super.toString();
	}

}
