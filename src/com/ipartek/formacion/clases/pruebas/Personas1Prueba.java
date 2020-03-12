package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Persona1;
import com.ipartek.formacion.clases.Profesor;

public class Personas1Prueba {

	public static void main(String[] args) {

		int notamax = 0, notamin = 0;
		int totalnotas = 0;

		Profesor profesor = new Profesor();
		profesor.setNombre("Einstein");
		profesor.setMateria("Fisica cuantica");

		// crear alumnos array
		Alumno[] alumnos = new Alumno[3];

		Alumno jaimito = new Alumno();
		jaimito.setNombre("Jaimito");
		jaimito.setGenero(Persona1.GENERO_MASCULINO);
		jaimito.setNota(Alumno.NOTA_MAX);

		Alumno jaimita = new Alumno();
		jaimita.setNombre("Jaimita");
		jaimita.setGenero(Persona1.GENERO_MASCULINO);
		jaimita.setNota(9);

		Alumno hodei = new Alumno();
		hodei.setNombre("Hodei");
		hodei.setGenero(Persona1.GENERO_INDEFINIDO);
		hodei.setNota(7);

		alumnos[0] = jaimito;
		alumnos[1] = jaimita;
		alumnos[2] = hodei;

		System.out.println("El profefor " + profesor.getNombre() + " imparte la materia de " + profesor.getMateria());
		System.out.println("Sus alumnos son:\n");

		Alumno alumnotaMaxima = new Alumno();
		Alumno alumnotaMinima = new Alumno();

		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());

			// System.out.println(alumno.toString());

			// calculo alumno con nota maxima
			if (alumno.getNota() > notamax) {
				notamax = alumno.getNota();
				alumnotaMaxima = alumno;
			}

			// calculo alumno con nota minima
			if (alumno.getNota() < notamin) {
				notamin = alumno.getNota();
				alumnotaMinima = alumno;
			}
			totalnotas += alumno.getNota();
		}

		System.out.println(
				"\nLa nota min es " + alumnotaMinima.getNota() + "\nLa nota maxima es " + alumnotaMaxima.getNota()
						+ "\nTotal notas: " + alumnos.length + "\nNota media " + (totalnotas / alumnos.length));

	}

}
