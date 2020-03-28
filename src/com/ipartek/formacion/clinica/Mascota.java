package com.ipartek.formacion.clinica;

public class Mascota extends Clinica {
	private String nombre;
	private String especie;
	private String raza;
	private int edad;
	private int idMascota;

	// CONSTRUCTOR
	public Mascota() {
		super();
		this.nombre = "";
		this.especie = "";
		this.raza = "";
		this.edad = 0;
		this.idMascota = 0;
	}

	public Mascota(String nombre, String especie, String raza, int edad, int id) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.edad = edad;
		this.idMascota = id;
	}

	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return idMascota;
	}

	public void setId(int id) {
		this.idMascota = id;
	}

	// toSTRING
	@Override
	public String toString() {
		return "Mascota nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad
				+ ", id Mascota=" + idMascota + ", " + super.toString();
	}

}
