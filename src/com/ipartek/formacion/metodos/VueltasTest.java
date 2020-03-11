package com.ipartek.formacion.metodos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VueltasTest {

	float DELTA = 0.001f;

	// 0.001
	// 4.995
	// 4.992

//	 
	@Test
	public void testCalcularVueltasOptimas() throws Exception {

//		int[] vueltas = Vueltas.calcularVueltasOptimas(100f, 100f);
//		int[] vueltasCorrectas = new int[Vueltas.BILLETES_MONEDAS.length];
//		assertArrayEquals(vueltas, vueltasCorrectas);

		int[] vueltas2 = Vueltas.calcularVueltasOptimas(0.01f, 500.02f);
		int[] vueltasCorrectas2 = new int[Vueltas.BILLETES_MONEDAS.length];
		vueltasCorrectas2[0] = 1; // 500 eurazos
		vueltasCorrectas2[14] = 1; // 1 centimo
		assertArrayEquals(vueltas2, vueltasCorrectas2);

//		int[] vueltas3 = Vueltas.calcularVueltasOptimas(150.00f, 300.50f);
//		int[] vueltasCorrectas3 = new int[Vueltas.BILLETES_MONEDAS.length];
//		vueltasCorrectas3[2] = 1; // 100 eurazos
//		vueltasCorrectas3[3] = 1;
//		vueltasCorrectas3[9] = 1; // 50 centimos
//		assertArrayEquals(vueltas3, vueltasCorrectas3);

		// TODO probar mas casos luego

	}

	@Test
	public void testCalcularVueltas() throws Exception {

		assertEquals(0, Vueltas.calcularVueltas(100, 100), DELTA);
		assertEquals(150.50f, Vueltas.calcularVueltas(150.00f, 300.50f), DELTA);

	}

	@Test(expected = Exception.class)
	public void testCalcularVueltasOptimasException() throws Exception {

		Vueltas.calcularVueltasOptimas(100, -12);

	}

	@Test(expected = Exception.class)
	public void testCalcularVueltasException() throws Exception {

		Vueltas.calcularVueltas(100, -23);

	}

}
