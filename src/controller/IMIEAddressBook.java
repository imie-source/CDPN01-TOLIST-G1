package controller;

import modele.Personne;

import java.util.ArrayList;
import java.util.List;

public class IMIEAddressBook implements AddressBook {

    private static List<Personne> people = new ArrayList<Personne>();

    @Override
    public List<Personne> getPeople() {
        return new ArrayList<Personne>(people);
    }

    @Override
    public void addPerson(String nom, String prenom, String telephone, String dateNaissance) {
        people.add(new Personne(nom, prenom, telephone, dateNaissance));
    }
}
