package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Vehiculo;

public class VehiculoPruebas {
	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("negro", "4444 GPS");
		Vehiculo v3 = new Vehiculo("blanco", "1111 XRS", 5);
		System.out.println("V1: " + v1.toString());
		System.out.println("V2: " + v2);// no es necesario llamar al to string, por defecto lo hace
		System.out.println("V3: " + v3);

		// vamos a pintar el coche
		v1.setColor("Rojo");

		// vamos a matricularlo
		v1.setMatricula("1234FGT");

		System.out.println("\nDespues de pintar y matricular V1: \n");
		System.out.println("Matricula: " + v1.getMatricula());
		System.out.println("Color: " + v1.getColor());
		System.out.println("Puertas: " + v1.getNumeroPuertas());
		System.out.println("Reudas: " + v1.getNumeroRuedas());
		System.out.println("Potencia" + v1.getPotencia());
	}
}
