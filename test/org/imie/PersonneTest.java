package org.imie;

import static org.junit.Assert.*;

import modele.Personne;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;


public class PersonneTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetNom() {
		Personne per = new Personne(null, null, null, null);
		per.setNom("bobo");
		assertEquals(per.getNom(),"bobo");
		
	}

}
