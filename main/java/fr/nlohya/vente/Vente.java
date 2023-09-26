package fr.nlohya.vente;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Vente {
    public static void main(String[] args) {
        System.out.println("Vente aux enchères");
        System.out.println("------------------");

        Lot lot1 = new Lot("Lot 1", 8, "Jean-Michel", 60);
        Lot lot2 = new Lot("Lot 2", 10, "Jean-Mychel", 50);
        Lot lot3 = new Lot("Lot 3", 6, "Jean-Mich3l", 60.15f);
        Lot lot4 = new Lot("Lot 4", 23, "Jean-M1chel", 59.99f);
        Lot lot5 = new Lot("Lot 5", 12, "JeAn-Michel", 99.99f);
        Lot lot6 = new Lot("Lot 6", 15, "J3an-Michel", 124);

        GestionLots gestionLots = new GestionLots(Arrays.asList(lot1, lot2, lot3, lot4, lot5, lot6));

        for (Lot lot : gestionLots.getLotsEnVente()) {
            VenteLot venteLot = new VenteLot(lot);

            System.out.println("Début de la vente du lot : " + venteLot.getNom());
            System.out.println("Propriétaire : " + venteLot.getProprietaire());
            System.out.println("Prix de départ : " + venteLot.getPrixDepart() + "e");

            Scanner scanner = new Scanner(System.in);

            while (venteLot.getEtatVente() == EtatVente.EN_VENTE) {
                System.out.println("Votre enchère : ");

                String userInput = scanner.nextLine();
                float prixPropose = venteLot.getPrixCourant();

                try {
                    prixPropose = Float.parseFloat(userInput);
                } catch (Exception e) {
                    if (userInput.equalsIgnoreCase("STOP")) {
                        venteLot.setEtatVente(EtatVente.VENDU);
                        if (venteLot.getNomAcheteur().equalsIgnoreCase("")) {
                            System.out.println("Vente annulée, personne ne veut ce lot");
                        } else {
                            System.out.println("Lot vendu à " + venteLot.getNomAcheteur() + " pour " + venteLot.getPrixCourant() + "e");
                        }
                        continue;
                    }
                }

                if (prixPropose <= venteLot.getPrixCourant()) {
                    System.out.println("Merci de proposer un prix correct !!!!!!");
                    continue;
                }

                System.out.println("Merci pour votre enchère, indiquez votre nom :");
                venteLot.setNomAcheteur(scanner.nextLine());
                venteLot.setPrixCourant(prixPropose);

                System.out.println("Nouveau prix : " + venteLot.getPrixCourant() + " par " + venteLot.getNomAcheteur());
                System.out.println("Les enchères se poursuivent !");
            }
        }

    }
}
