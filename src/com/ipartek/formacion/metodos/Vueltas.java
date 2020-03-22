package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

//	  500f, 0
//	  200f, 1
//	  100f, 2
//	  50f,  3
//	  20f,  4
//	  10f,  5
//	  5f,   6
//	  2f,   7
//	  1f,   8
//	  0.50f,  9
//	  0.20f,  10
//	  0.10f,  11
//	  0.05f,  12
//	  0.02f,  13
//	  0.01f };  14

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] aDevolver = new int[BILLETES_MONEDAS.length];
		float cambio = entregado - importe;
		
		
		// si lo entregado es menor al importe lanza excepcion
		if (entregado < BILLETES_MONEDAS[14]) {
			throw new Exception("Error, la cantidad entregada es menor al importe a cobrar");
		} else {// si no lo

			if (cambio != 0.0f) {

				
				
				for (int i = 0; i < aDevolver.length; i++) {

					String cambioString = String.valueOf(cambio);

					if (cambioString.length() > 5) {

						if (Integer.parseInt(String.valueOf(cambioString.toCharArray()[5])) == 9) {
							cambio += 0.001;
						}
//						else if (Integer.parseInt(String.valueOf(cambioString.toCharArray()[4])) == 9) {
//							cambio += 0.10;
//						}

						cambioString = String.valueOf(cambio).substring(0, 5);

					}else {
						cambioString = String.valueOf(cambio);
					}


					cambio = Float.parseFloat(cambioString);

					if (cambio >= BILLETES_MONEDAS[i]) {
						aDevolver[i] += 1;
						cambio = cambio - BILLETES_MONEDAS[i];
					}
				}
			}

		}




		return aDevolver;

	}

	public static float calcularVueltas(float importe, float entregado) throws Exception {
		// TODO vuestro marron

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		float v = 0;

		if (entregado < BILLETES_MONEDAS[14]) {
			throw new Exception("EL dinero entregado es negativo");
		} else {

			if (entregado - importe != 0f) {
				v = entregado - importe;
			}
		}
		return v;
	}

}
