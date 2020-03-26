package com.ipartek.formacion.animales;

public class Pez extends Animal {

	// variables globales
	private int aletas;
	private String color;
	private String nombre;

	// CONSTRUCTOR
	public Pez() {
		super(Animal.TIPO[2]);
		aletas = 2;
		this.color = "";
		this.nombre = "";
	}

	// GETTERS AND SETTERS
	public int getAletas() {
		return aletas;
	}

	public void setAletas(int aletas) {
		this.aletas = aletas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "aletas=" + aletas + ", color=" + color + " ,nombre=" + nombre + super.toString();
	}

}
