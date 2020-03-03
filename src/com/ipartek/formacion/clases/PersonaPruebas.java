package com.ipartek.formacion.clases;

public class PersonaPruebas {

	public static void main(String[] args) {

		// Usamos la palabra new para crear un objeto o isntaciar
		Persona adam = new Persona();

		adam.setNombre("Adam");
		adam.setEdad(20);

		System.out.println("Mi nombre es " + adam.getNombre() + " tengo " + adam.getEdad() + " años");

		Persona eva = new Persona();
		eva.setNombre("Eva");
		eva.setEdad(25);

		System.out.println("Mi nombre es " + eva.getNombre() + " tengo " + eva.getEdad() + " años");

		System.out.println(adam); // el syso hace un .toString() automatico
		System.out.println(eva.toString());
	}

}
