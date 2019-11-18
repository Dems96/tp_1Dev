package org.ldv.sio;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Adresse domicile = new Adresse("3rue du clocher", 77000, "melun");

    Adresse livraison = new Adresse("5 rue des fraisier", 91370, "massy");
    Adresse livraison1 = new Adresse("139 rue d'estienne d'orves", 91370, "vlb");

    ArrayList<Adresse> listeAdresse = new ArrayList<>();
    listeAdresse.add(livraison);
    listeAdresse.add(livraison1);

    Client c = null;
    Client clientSansLivraison = null;
    AdresseEtendue email = new AdresseEtendue("edsger@dijstra.org", "https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
    String nom = "bop";
    String prenom = "bop2";

    if (listeAdresse == null){

      listeAdresse.add(livraison);
      listeAdresse.add(livraison1);
      clientSansLivraison = new Client(nom, prenom, domicile, listeAdresse, email);
      System.out.println(clientSansLivraison.toString());

    }else {

      listeAdresse.add(livraison);
      listeAdresse.add(livraison1);
      c = new Client("Dijkstra", "Edsger", domicile, listeAdresse, email);
      System.out.println(c.toString());
    }


  }
}
