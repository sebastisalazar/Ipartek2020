package com.ipartek.formacion.clases;

import java.util.Scanner;

public class PaisesPruebas {

	public static void main(String[] args) {

		int totalinf = 0;
		// instancia del array paises
		Pais[] paises = new Pais[2]; // longitud de dos paises

		// Scanner para poder recoger lo que el usuario escribe
		Scanner sc = new Scanner(System.in);

		// INICIO FOR
		for (int i = 0; i < paises.length; i++) {

			// instancia del objeto pais
			Pais p = new Pais();

			System.out.print("\n**************************************\n");
			// pregunta el nombre del pais
			System.out.print("Nombre del pais: ");
			p.setNombre(sc.nextLine());

			// pregunta el numero de infectados
			System.out.print("Está infectado?(s/n): ");

			// Condicion para los infectados
			if ("s".equalsIgnoreCase(sc.nextLine())) {

				
				// damos valor al atributo infectado del objeto
				p.setInfectado(true);

				// Pregunta el numero de casos
				System.out.print("Indica el número de casos:");
				// damos valor al atributo de numerodeinfectados del objeto
				int numcaso = Integer.parseInt(sc.nextLine());
				totalinf += numcaso;
				p.setNumeroInfectados(numcaso);

			} // fin del if

			paises[i] = p;// Añade el objeto pais al array de paises

			// ESTADISTICAS

			if (i == paises.length - 1) {// IF ESTADISTICAS

				System.out.print("\n**************************************\n\n\tESTADISTICAS");

				System.out.println("\n********************************\nPAISES NO INFECTADOS\n");
				// FOR PARA SABER LOS PAISES NO INFECTADOS
				for (int j = 0; j < paises.length; j++) {

					if (!paises[j].isInfectado()) {
						System.out.println(paises[j].getNombre() + ", " + paises[j].getNumeroInfectados() + " casos");
					} // FIN IF

				} // FIN FOR

				System.out.println("\n********************************\nPAISES CON MÁS DE 2 CASOS\n");

				// FOR PARA SABER LOS PAISES CON MAS DE DOS CASOS
				for (int j = 0; j < paises.length; j++) {

					if (paises[j].getNumeroInfectados() > 2) {
						System.out.println(paises[j].getNombre() + ", " + paises[j].getNumeroInfectados() + " casos");
					} // FIN IF

				} // FIN FOR

				System.out.println("\n********************************\nTODOS LOS PAISES INFECTADOS\n");
				// FOR PARA SABER LOS PAISES NO INFECTADOS
				for (int j = 0; j < paises.length; j++) {

					
					if (paises[j].isInfectado()) {
						System.out.println(paises[j].getNombre() + ", " + paises[j].getNumeroInfectados() + " casos");
					} else {

					} // FIN IF

				} // FIN FOR
				System.out.println("\n********************************\n");
				System.out.print("Total INFECTADOS: " + totalinf);
				System.out.println("\n\n********************************");
			} // FIN IF
			
		
		} // FIN FOR
		sc.close();

	}

}
