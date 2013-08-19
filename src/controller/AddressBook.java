package controller;

import modele.Personne;

import java.util.Collection;

public interface AddressBook {

    Collection<Personne> getPeople();

    String addPerson(String nom, String prenom, String telephone, String dateNaissance);

    void removePerson(String id);

    void modifierPerson(String id, Personne person);
}
