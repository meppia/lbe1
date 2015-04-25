package com.lbe.serienumeriche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SerieArmonicaTest {

	private SerieArmonica test;

	@Before
	public void setUp() throws Exception {
		test = new SerieArmonica();
	}

	@Test
	public void testCalcolaProssimoValoreSerie() {
		test.calcolaNextValoreSerie(8);
		assertTrue(test.calcolaNextValoreSerie()>0);
		System.out.println(test.toString());
	}

	@Test
	public void testCalcolaNextValoreSerie() {
		assertTrue(test.calcolaNextValoreSerie()>0);
		System.out.println(test.toString());
		test.calcolaNextValoreSerie(p-> 1d/(p*p*1d));
	}

	

}
