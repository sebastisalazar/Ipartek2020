package com.ipartek.formacion.clases;

public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super();
		// this.numeroRuedas=5; cambiar en vehiculo de private a protected
		setNumeroPuertas(5);
		setNumeroRuedas(4);
		this.radio = false;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Coche [radio=" + radio + ", " + super.toString() + "]";
	}

}
