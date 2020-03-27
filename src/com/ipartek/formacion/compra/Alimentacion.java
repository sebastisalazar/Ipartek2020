package com.ipartek.formacion.compra;

public class Alimentacion {

	private int idItem;
	private int cantidad;

	// CONSTRUCTOR
	public Alimentacion() {
		super();
		this.idItem = 0;
		this.cantidad = 0;
	}

	// GETTERS AND SETTERS

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "idItem=" + idItem + ", cantidad=" + cantidad;
	}

}
