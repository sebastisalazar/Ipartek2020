package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * Pedir al usuario la temperatura de los dias de la semana, comenzando por el
 * lunes
 * 
 * -Mostrar por pantalla la media de la semana, y la temperatura mas alta y baja
 * 
 *
 */

public class MediaNumerosFor {

	public static void main(String[] args) {

		float[] TempSemanal = { 0, 0, 0, 0, 0, 0, 0 };
		float mediaSemanal = 0, tempmaxima = Float.MIN_VALUE, tempminima = Float.MAX_VALUE;
		final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < DIAS_SEMANA.length; i++) {

			System.out.println("Temperatura del " + DIAS_SEMANA[i] + " : ");
			TempSemanal[i] = Float.parseFloat(sc.nextLine());
			mediaSemanal += TempSemanal[i];

			if (TempSemanal[i] > tempmaxima) {
				tempmaxima = TempSemanal[i];
			}

			if (TempSemanal[i] < tempminima) {
				tempminima = TempSemanal[i];
			}

		} // fin for

		System.out.println("La media semanal es: " + (int) (mediaSemanal / 7) + " ºC");
		System.out.println("El maximo es: " + (int) tempmaxima + " ºC");
		System.out.println("El minimo es: " + (int) tempminima + " ºC");

		sc.close();

	}// fin main

	// Funcion para sacar la temperatura maxima

}
