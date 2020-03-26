package com.ipartek.formacion.animales;

public class Canario extends Ave {
	// VARIABLE GlOBAL
	private String nombre;
	private String color;

	// CONSTRUCTOR
	public Canario() {
		super();
		this.color = "";
		this.nombre = "";
	}

	// TOSTRING

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", color=" + color + ", " + super.toString();
	}

}
