package com.ipartek.formacion.animales;

public class Mamifero extends Animal {

	// encapsulamiento

	// variable globlal
	private int orejas;
	private int patas;
	private boolean cola;
	private String color;
	private String raza;
	private boolean pelo;
	// variable publica

	// CONSTRUCTOR
	public Mamifero() {
		super(Animal.TIPO[0]);
		this.orejas = 2;
		this.patas = 2;
		this.cola = true;
		this.color = "";
		this.raza = "";
		this.pelo = true;
	}

	// GETTERS AND SETTERS

	public int getOrejas() {
		return orejas;
	}

	public void setOrejas(int orejas) {
		this.orejas = orejas;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

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

	// TO STRING

	@Override
	public String toString() {
		return "orejas=" + orejas + ", patas=" + patas + ", cola=" + cola + ", color=" + color + ", raza=" + raza
				+ ", pelo=" + pelo + ", " + super.toString();
	}

}
