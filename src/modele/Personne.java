package modele;

import java.util.UUID;

public class Personne {

    private String id;
	private String nom;
	private String prenom;
	private String telephone;
	private String dateNaissance;

    public Personne(String nom, String prenom, String telephone, String dateNaissance) {
        this.id = UUID.randomUUID().toString();
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
    }

    public String getId() {
        return this.id;
    }
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public String getTelephone() {
		return this.telephone;
	}
	public String getDateNaissance() {
		return this.dateNaissance;
	}
}
