package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;
  private ArrayList<Adresse> livraison;
  private Adresse habitation;
  private AdresseEtendue adresseEtendue;
  @Before
  public void initializeEachTest() {
    this.livraison = new Adresse("3 rue du clocher", 77000, "melun");
    this.habitation = new Adresse("3 allée des fraisier", 91370, "massy");
    this.adresseEtendue = new AdresseEtendue("edsger@dijstra.org","https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
    this.c = new Client("Dijkstra", "Edsger", habitation, livraison, adresseEtendue);
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }

  @Test
  public void AdrDomicile() {
    assertEquals(habitation,this.c.getHabitation());
  }

  @Test
  public void AdrHabitationLivraison() {
    assertEquals(this.c.getHabitation(),this.c.getLivraison());
  }

  @Test
  public void getUrl() {
    assertEquals("https://fr.wikipedia.org/wiki/Edsger_Dijkstra", this.adresseEtendue.getUrl());
  }

  @Test
  public void getEmaill() {
    assertEquals("edsger@dijstra.org", this.adresseEtendue.getEmail());
  }
}