package org.ldv.sio;

import java.util.ArrayList;

public class Adresse extends ArrayList<Adresse> {

    private String rue;
    private int codePosatale;
    private String ville;

    public Adresse(String rue, int codePostale, String ville){
        this.rue = rue;
        this.codePosatale = codePostale;
        this.ville = ville;

    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePosatale() {
        return codePosatale;
    }

    public void setCodePosatale(int codePosatale) {
        this.codePosatale = codePosatale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", codePosatale=" + codePosatale +
                ", ville='" + ville + '\'' +
                '}';
    }
}
