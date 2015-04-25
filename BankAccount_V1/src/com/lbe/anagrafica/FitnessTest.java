package com.lbe.anagrafica;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class FitnessTest {
	private Fitness test;

	@Before
	public void setUp () throws Exception {
		//prepara oggetto
		test = new Fitness();
		test.setAltezza(1.93);
		test.setPeso(78.5);
	}

	@Test
	public void testIndiceMassaCorporea() {
		assertFalse("Altezza non valida", test.getAltezza()<=0);
		assertFalse("Peso non valida", test.getPeso()<=0);
		assertTrue(test.indiceMassaCorporea()>0);
		
	}

	@Test
	public void testCalorieGiornaliere() {
		assertFalse("Peso non valida", test.getPeso()<=0);
		assertTrue(test.calorieGiornaliere()>0);
		
	}

}
