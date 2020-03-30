package com.ipartek.formacion.ficheros;

public class Persona {
	private String nombre;
	private String empresa;
	private String fechaNacimiento;
	private String telefono;
	private String email;
	private String numeroPersonal;

	// CONSTRUCTOR
	public Persona() {
		super();
		this.nombre = "";
		this.empresa = "";
		this.fechaNacimiento = "";
		this.telefono = "";
		this.email = "";
		this.numeroPersonal = "";
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNumeroPersonal() {
		return numeroPersonal;
	}

	public void setNumeroPersonal(String numeroPersonal) {
		this.numeroPersonal = numeroPersonal;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "nombre=" + nombre + ", empresa=" + empresa + ", fechaNacimiento=" + fechaNacimiento + ", telefono="
				+ telefono + ", email=" + email + ", numeroPersonal=" + numeroPersonal;
	}
}
