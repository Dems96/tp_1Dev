package org.ldv.sio;

import android.widget.ListView;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private ArrayList<Adresse> Livraison;
    private Adresse Habitation;
    private AdresseEtendue adresseEtendue;

    public Client(String nom, String prenom, Adresse Habitation, ArrayList<Adresse> Livraison, AdresseEtendue adresseEtendue) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseEtendue = adresseEtendue;
        if (this.Livraison == null) {
            this.Livraison = Livraison;
            this.Habitation = Habitation;
        }else{
            this.Livraison = Livraison;
            this.Habitation = Habitation;
        }
    }

    public Client(String nom, String prenom, Adresse Habitation, AdresseEtendue adresseEtendue) {
        this.adresseEtendue = adresseEtendue;
        this.nom = nom;
        this.prenom = prenom;
        this.Habitation = Habitation;

    }

    public Adresse getHabitation () {
            return Habitation;
        }

    public void setLivraison(ArrayList<Adresse> livraison) {
        Livraison = livraison;
    }

    public AdresseEtendue getAdresseEtendue() {
        return adresseEtendue;
    }

    public void setAdresseEtendue(AdresseEtendue adresseEtendue) {
        this.adresseEtendue = adresseEtendue;
    }

    public void setHabitation (Adresse Habitation){
            Habitation = Habitation;
        }

        public ArrayList<Adresse> getLivraison () {
            return Livraison;
        }

        public void setLivraison (Adresse Livraison){
            Livraison = Livraison;
        }

        public String getNom () {
            return nom;
        }

        public void setNom (String nom){
            this.nom = nom;
        }

        public String getPrenom () {
            return prenom;
        }

        public void setPrenom (String prenom){
            this.prenom = prenom;
        }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", Livraison=" + Livraison +
                ", Habitation=" + Habitation +
                ", adresseEtendue=" + adresseEtendue +
                '}';
    }
}

