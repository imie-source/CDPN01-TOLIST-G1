package org.imie;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modele.Personne;

import org.junit.Assert;
import org.junit.Test;

import controller.IMIEAddressBook;

public class Sample {

	@Test
	public void emptyPeople() {
		// Asset
		IMIEAddressBook book = new IMIEAddressBook(); 
		List<Personne> collection = new ArrayList<Personne>();
		
		// Act
		
		// Assert
		assertArrayEquals(collection.toArray(), book.getPeople().toArray());
	}
	
	@Test
	public void addPerson() {
		// Asset
		IMIEAddressBook book = new IMIEAddressBook(); 
		List<Personne> collection = new ArrayList<Personne>();
		collection.add(new Personne("L'éponge", "Bob", "06.23.23.23.23", "21/08/2013"));
		
		// Act
		book.addPerson("L'éponge", "Bob", "06.23.23.23.23", "21/08/2013");
		
		// Assert
		assertEquals(collection.get(0).getNom(), ((List<Personne>) book.getPeople()).get(0).getNom());
	}

}
