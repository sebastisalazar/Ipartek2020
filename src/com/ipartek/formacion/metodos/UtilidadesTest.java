package com.ipartek.formacion.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class UtilidadesTest {

//	@Test
//	public void testSaludarString() {
//		fail("Not yet implemented");
//	}

	@Test

	public void testSaludarStringString() throws Exception {
		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_CASTELLANO));
		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_EUSKERA));
		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_INGLES));

		try {
			Utilidades.saludar("Manolo", "Suagili");
			fail("Idioma no soportado");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Test
	public void testSuma() {
		assertEquals(6, Utilidades.suma(3, 3));

		// mas aserciones que podemos usar
		assertTrue(true);
		assertFalse(2 > 300);
		assertNull(null);
		// assertNotNull
	}

//	@Test
//	public void testCalcularLetraDniInt() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testCalcularLetraDniString() {
//		fail("Not yet implemented");
//	}

}
