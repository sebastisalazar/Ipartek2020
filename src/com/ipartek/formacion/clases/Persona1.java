package com.ipartek.formacion.clases;

public class Persona1 {

	// atributos
	public static final char GENERO_FEMENINO = 'f';
	public static final char GENERO_MASCULINO = 'm';
	public static final char GENERO_INDEFINIDO = 'i';

	private String nombre;
	private int altura;
	private int edad;
	private char genero;
	private String raza;

	public Persona1() {
		super();
		this.nombre = "Anonimo";
		this.altura = 0;
		this.edad = 0;
		this.genero = GENERO_INDEFINIDO;
		this.raza = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public static char getGeneroFemenino() {
		return GENERO_FEMENINO;
	}

	public static char getGeneroMasculino() {
		return GENERO_MASCULINO;
	}

	public static char getGeneroIndefinido() {
		return GENERO_INDEFINIDO;
	}

	@Override
	public String toString() {
		return "Persona1 [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + ", raza="
				+ raza + ", toString()=" + super.toString() + "]";
	}

}
