package com.ipartek.formacion.clases;

public class Persona {

	// ATRIBUTOS********************************************
	// atributos siempre son private para que no se puedan manipular desde fuera de
	// esta clase, para poder manipular los atributos hay que crear metodos
	// 'publicos
	// denominamos getters y setters. A esto se le llama 'encapsulación'

	private String nombre;
	private int edad;

	// CONSTRUCTORES
	// constructor porque se llama igual que la clase
	public Persona() {
		super();

		this.nombre = "Anonimo";
		this.edad = 18;
	}

	// GETTERS AND SETTERS
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// OTROS
}
