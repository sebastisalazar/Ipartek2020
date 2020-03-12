package com.ipartek.formacion.clases;

public class Alumno extends Persona1 {

	public static final int NOTA_MIN = 0;
	public static final int NOTA_MAX = 10;
	private String email;
	private String github;
	private int nota;

	// CONSTRUCTOR
	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 5;
	}

	// GETTERS AND SETTERS
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public static int getNotaMin() {
		return NOTA_MIN;
	}

	public static int getNotaMax() {
		return NOTA_MAX;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Alumno [email=" + email + ", github=" + github + ", nota=" + nota + ", toString()=" + super.toString()
				+ "]";
	}
}
