package com.ipartek.formacion.clinica;

public class Doctor extends Clinica {
	private String nombre;
	private String horario;
	private int id;

	// CONSTRUCTORERS
	public Doctor() {
		super();
		this.nombre = "";
		this.horario = "";
		this.id = 0;
	}

	public Doctor(String nombre, String horario, int id) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.id = id;
	}

	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Doctor=" + nombre + ", horario=" + horario + ", id=" + id + ", " + super.toString();
	}

}
