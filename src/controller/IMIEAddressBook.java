package controller;

import modele.Personne;

import java.util.*;

public class IMIEAddressBook implements AddressBook {

    private static Map<String, Personne> people = new HashMap<String, Personne>();

    @Override
    public Collection<Personne> getPeople() {
        return new ArrayList<Personne>(people.values());
    }

    @Override
    public String addPerson(String nom, String prenom, String telephone, String dateNaissance) {
        Personne person = new Personne(nom, prenom, telephone, dateNaissance);
        people.put(person.getId(), person);
        return person.getId();
    }

    @Override
    public void removePerson(String id) {
        people.remove(id);
    }

    @Override
    public void modifierPerson(String id, Personne person) {
        people.put(id, person);
    }
}
