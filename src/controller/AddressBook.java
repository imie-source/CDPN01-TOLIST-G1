package controller;

import modele.Personne;

import java.util.List;

public interface AddressBook {

    List<Personne> getPeople();
    void addPerson(String nom, String prenom, String telephone, String dateNaissance);
	void removePersonne(String parameter);
	void modifierPersonne(String parameter, Personne per);
}
