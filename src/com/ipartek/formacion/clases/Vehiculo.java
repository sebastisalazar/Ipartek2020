package com.ipartek.formacion.clases;

public class Vehiculo {
	// 1. Atributos
	private String color;
	private String matricula;
	private int numeroRuedas;
	private int numeroPuertas;
	private float potencia; // CV
	// 2. Constructores

	// Constructor por defecto
	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
		this.numeroRuedas = 0;
		this.numeroPuertas = 0;
		this.potencia = 0;
	}

	// Constructor1 sobrecargado
	public Vehiculo(String color, String matricula) {
		// super(); -> llama a object (superclase/al padre)
		this();// llamamos al constructor por defecto de la propia clase
		this.color = color;
		this.matricula = matricula;
	}

	// Constructor2 sobrecargado
	public Vehiculo(String color, String matricula, int numeroPuertas) {

//		this.color = color;
//		this.matricula = matricula;
		this(color, matricula); // reutilizando codigo, llamando al Constructor2
		this.numeroPuertas = numeroPuertas;
	}

	// 3. Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	// 4. To string
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", numeroRuedas=" + numeroRuedas
				+ ", numeroPuertas=" + numeroPuertas + ", potencia=" + potencia + "]";
	}
	// 5. Resto de metodos || funciones || comportamiento si hiciensen falta

}
