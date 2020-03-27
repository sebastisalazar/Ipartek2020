package com.ipartek.formacion.compra;

public class Bebida extends Alimentacion {

	private double precio;
	private double graduacion;
	private String nombre;
	private String descripcion;
	private boolean gaseosa;

	// CONSTRUCTOR
	public Bebida() {
		super();
		this.precio = 0;
		this.graduacion = 0;
		this.nombre = "bebidaItem";
		this.descripcion = "noDescrip";
		this.gaseosa = false;
	}

	// GETTERS AND SETTERS
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
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

	public boolean isGaseosa() {
		return gaseosa;
	}

	public void setGaseosa(boolean gaseosa) {
		this.gaseosa = gaseosa;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "tipo=Bebida, precio=" + precio + ", graduacion=" + graduacion + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", gaseosa=" + gaseosa;
	}

}
