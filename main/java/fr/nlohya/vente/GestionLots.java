package fr.nlohya.vente;

import java.util.List;

public class GestionLots {

    private List<Lot> lotsEnVente;

    public GestionLots(List<Lot> lotsEnVente) {
        this.lotsEnVente = lotsEnVente;
    }

    public List<Lot> getLotsEnVente() {
        return lotsEnVente;
    }

    public void setLotsEnVente(List<Lot> lotsEnVente) {
        this.lotsEnVente = lotsEnVente;
    }
}
