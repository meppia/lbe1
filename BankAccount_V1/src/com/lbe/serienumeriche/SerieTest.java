package com.lbe.serienumeriche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SerieTest {

	private Serie test;

	@Before
	public void setUp() throws Exception {
		test = new Serie(p-> 1d/(1d*p*p));
	}

	@Test
	public void testCalcolaProssimoValoreSerie() {
		test.calcolaNextValoreSerie(1000000);
		assertTrue(test.calcolaNextValoreSerie()>0);
		System.out.println(test.toString());
	}

	@Test
	public void testCalcolaNextValoreSerie() {
		assertTrue(test.calcolaNextValoreSerie()>0);
		System.out.println(test.toString());
	}

	

}
