package com.ipartek.formacion.clases;

public class Pais {

	// ATRIBUTOS

	private String nombre;
	private int numeroInfectados;
	private boolean isInfectado;

	// CONSTRUCTOR
	public Pais() {
		super();

		this.nombre = "";
		this.numeroInfectados = 0;
		this.isInfectado = false;
	}

	// TO STRING
	@Override
	public String toString() {
		return nombre + ", numeroInfectados=" + numeroInfectados + ", isInfectado=" + isInfectado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}

	public boolean isInfectado() {
		return isInfectado;
	}

	public void setInfectado(boolean isInfectado) {
		this.isInfectado = isInfectado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
