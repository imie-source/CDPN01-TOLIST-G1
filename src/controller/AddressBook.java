package controller;

import modele.Personne;

import java.util.List;

public interface AddressBook {

    List<Personne> getPeople();
    void addPerson(String nom, String prenom, String telephone, String dateNaissance);
	void removePerson(String id);
	void modifierPerson(String id, Personne per);
}
