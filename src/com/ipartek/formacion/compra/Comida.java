package com.ipartek.formacion.compra;

public class Comida extends Alimentacion {
	private double precio;
	private double peso;
	private String nombre;
	private String descripcion;
	private double calorias;

	// constructor
	public Comida() {
		super();
		this.precio = 0;
		this.peso = 0;
		this.nombre = "comidaItem";
		this.descripcion = "noDescrip";
		this.calorias = 0;
	}

	// GETTERS AND SETTERS

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "tipo=Comida , precio=" + precio + ", peso=" + peso + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", calorias=" + calorias;
	}

}
