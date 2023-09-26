package fr.nlohya.vente;

public class Lot {

    private String nom;

    private float poids;

    private String proprietaire;

    private float prixDepart;

    public Lot(String nom, float poids, String proprietaire, float prixDepart) {
        this.nom = nom;
        this.poids = poids;
        this.proprietaire = proprietaire;
        this.prixDepart = prixDepart;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public float getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(float prixDepart) {
        this.prixDepart = prixDepart;
    }
}
