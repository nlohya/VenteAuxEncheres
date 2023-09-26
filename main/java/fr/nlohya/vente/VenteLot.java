package fr.nlohya.vente;

public class VenteLot extends Lot {

    private float prixCourant;

    private String nomAcheteur;

    private EtatVente etatVente;

    public VenteLot(String nom, float poids, String proprietaire, float prixDepart) {
        super(nom, poids, proprietaire, prixDepart);
        this.prixCourant = prixDepart;
        this.nomAcheteur = "";
        this.etatVente = EtatVente.EN_VENTE;
    }

    public VenteLot(Lot lot) {
        super(lot.getNom(), lot.getPoids(), lot.getProprietaire(), lot.getPrixDepart());
        this.prixCourant = lot.getPrixDepart();
        this.nomAcheteur = "";
        this.etatVente = EtatVente.EN_VENTE;
    }

    public float getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(float prixCourant) {
        this.prixCourant = prixCourant;
    }

    public String getNomAcheteur() {
        return nomAcheteur;
    }

    public void setNomAcheteur(String nomAcheteur) {
        this.nomAcheteur = nomAcheteur;
    }

    public EtatVente getEtatVente() {
        return etatVente;
    }

    public void setEtatVente(EtatVente etatVente) {
        this.etatVente = etatVente;
    }
}
