package com.ipartek.formacion.clases;

public class Profesor extends Persona1 {

	private float sueldo;
	private String materia;

	// CONSTRUCTOR
	public Profesor() {
		super();
		this.sueldo = 2000;
		this.materia = "";

	}

	// GETTERS AND SETTERS
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", materia=" + materia + ", toString()=" + super.toString() + "]";
	}

}
