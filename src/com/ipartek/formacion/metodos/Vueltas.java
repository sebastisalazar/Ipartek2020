package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		float vueltasFloat = entregado;
		String vueltasString = String.valueOf(vueltasFloat);
		// TODO vuestro marron

		if (entregado < BILLETES_MONEDAS[14]) {

			throw new Exception("EL dinero entregado es negativo");
		} else {

			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

				if ((entregado - importe) == 0.0f) {
					i = BILLETES_MONEDAS.length - 1;
				} else {
					if (vueltasFloat >= BILLETES_MONEDAS[i]) {

						vueltas[i] += 1;

						vueltasFloat = vueltasFloat - BILLETES_MONEDAS[i];
						vueltasString = String.valueOf(vueltasFloat);

						try {
							vueltasString = String.valueOf(vueltasFloat).substring(0, 4);
						} catch (Exception e) {

						}

						vueltasFloat = Float.valueOf(vueltasString);

					}
				}

			}

		}

		return vueltas;

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
