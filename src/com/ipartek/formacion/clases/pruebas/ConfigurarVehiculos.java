package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Coche;

public class ConfigurarVehiculos {

	public static void main(String[] args) {

		String color;
		String matricula;
		int numeroRuedas;
		int numeroPuertas;
		float potencia;
		Scanner sc = new Scanner(System.in);

//		System.out.print("\n Color: ");
//		color = sc.nextLine();
//		System.out.print("\n Matricula: ");
//		matricula = sc.nextLine();
//		System.out.print("\n Numero de Ruedas: ");
//		numeroRuedas = Integer.parseInt(sc.nextLine());
//		System.out.print("\n Numero de Puertas: ");
//		numeroPuertas = Integer.parseInt(sc.nextLine());
//		System.out.print("\n Potencia: ");
//		potencia = Float.parseFloat(sc.nextLine());
//
//		sc.close();
//
//		Vehiculo v = new Vehiculo(color, matricula, numeroPuertas);
//		v.setNumeroPuertas(numeroPuertas);
//		v.setNumeroRuedas(numeroRuedas);
//		v.setPotencia(potencia);
//
//		System.out.println("\nVehicule successfully created\n");
//		System.out.println(v);

		Coche chincuchento = new Coche();
		System.out.println("Coche chincuchento -> " + chincuchento);

	}

}
