package com.ipartek.formacion.clinica;

public class Clinica {

	private String cif;
	private String direccion;

	// CONSTRUCTOR
	public Clinica() {
		super();
		this.cif = "Q12345A";
		this.direccion = "Pozas 14 ";
	}

	// GETTERs
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Clinica_cif=" + cif + ", direccion_clinica=" + direccion;
	}

}
