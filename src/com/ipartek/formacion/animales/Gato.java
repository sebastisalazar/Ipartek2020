package com.ipartek.formacion.animales;

public class Gato extends Mamifero {

	// variable globales privadas

	String nombre;



	// CONSTRUCTOR
	public Gato() {
		super(Mamifero.TIPO[0]);
		this.color = "";
		this.raza = "";
	}

	// GETTERS AND SETTERS



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", pelo=" + pelo + ", toString()=" + super.toString() + "]";
	}

	// TO STRING




}
