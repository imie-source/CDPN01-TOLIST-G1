package org.imie;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import modele.Personne;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.IMIEAddressBook;

public class IMIEAdressBookTest {
	
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
	public void testAddPerson() {
		
		IMIEAddressBook ad = new IMIEAddressBook();
		String newId = ad.addPerson("BOB", "CARRE", "06060666666", "21/12/1989");
		
		List<Personne> liste = (ArrayList<Personne>) ad.getPeople();
		Personne personneTest = liste.get(liste.size()-1);
		
		assertEquals("Nom correct ?", "BOB", personneTest.getNom());
		assertEquals("Prenom correct ?", "CARRE", personneTest.getPrenom());
	}

	@Test
	public void testRemovePerson() {
		
	}

	@Test
	public void testModifierPerson() {
		//fail("Not yet implemented"); // TODO
	}

}
